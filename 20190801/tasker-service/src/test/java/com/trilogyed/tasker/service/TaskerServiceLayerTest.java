package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.dao.TaskerDaoJdbcTemplateImpl;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class TaskerServiceLayerTest {

    private TaskerServiceLayer service;
    private TaskerDao dao;
    private RestTemplate restTemplate;
    private DiscoveryClient discoveryClient;

    @Value("${adserverServiceName}")
    private String adserverServiceName;

    @Value("${serviceProtocol}")
    private String serviceProtocol;

    @Value("${servicePath}")
    private String servicePath;

    @Before
    public void setUp() throws Exception {

        setUpTaskerDaoMock();
        setUpRestTemplateMock();
        setUpDiscoveryClientMock();

        service = new TaskerServiceLayer(dao, discoveryClient, restTemplate, "adserver-service", "http://", "/ad");
    }

    @Test
    public void fetchAllTasks() {

        TaskViewModel taskViewModel = new TaskViewModel();
        taskViewModel.setId(5);
        taskViewModel.setDescription("Complete summative");
        taskViewModel.setCreateDate(LocalDate.of(2019, 7, 27));
        taskViewModel.setDueDate(LocalDate.of(2019, 7, 31));
        taskViewModel.setCategory("Java Boot Camp");
//        taskViewModel.setAdvertisement("BOGO large 2 topping pizzas!");

        List<TaskViewModel> taskViewModels = service.fetchAllTasks();
        assertEquals(taskViewModels.size(), 1);
    }

    @Test
    public void fetchTasksByCategory() {

        TaskViewModel taskViewModel = new TaskViewModel();

        taskViewModel.setId(1);
        taskViewModel.setDescription("Complete summative");
        taskViewModel.setCreateDate(LocalDate.of(2019, 7, 27));
        taskViewModel.setDueDate(LocalDate.of(2019, 7, 31));
        taskViewModel.setCategory("Java Boot Camp");
        taskViewModel.setAdvertisement("BOGO large 2 topping pizzas!");

        taskViewModel = service.newTask(taskViewModel);
        List<TaskViewModel> taskViewModels = service.fetchTasksByCategory("Java Boot Camp");
        assertEquals(1, taskViewModels.size());
        assertEquals(taskViewModel, taskViewModels.get(0));
    }

    @Test
    public void newFetchTask() {

        TaskViewModel taskViewModel = new TaskViewModel();

        taskViewModel.setDescription("Complete summative");
        taskViewModel.setCreateDate(LocalDate.of(2019, 7, 27));
        taskViewModel.setDueDate(LocalDate.of(2019, 7, 31));
        taskViewModel.setCategory("Java Boot Camp");
        taskViewModel.setAdvertisement("BOGO large 2 topping pizzas!");

        taskViewModel = service.newTask(taskViewModel);
        TaskViewModel fromService = service.fetchTask(taskViewModel.getId());
        assertEquals(taskViewModel, fromService);
    }

    private void setUpTaskerDaoMock() {

        dao = mock(TaskerDaoJdbcTemplateImpl.class);

        Task task1 = new Task();
        task1.setId(1);
        task1.setDescription("Complete summative");
        task1.setCreateDate(LocalDate.of(2019, 7, 27));
        task1.setDueDate(LocalDate.of(2019, 7, 31));
        task1.setCategory("Java Boot Camp");

        Task task2 = new Task();
        task2.setDescription("Complete summative");
        task2.setCreateDate(LocalDate.of(2019, 7, 27));
        task2.setDueDate(LocalDate.of(2019, 7, 31));
        task2.setCategory("Java Boot Camp");

        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);

        doReturn(task1).when(dao).createTask(task2);
        doReturn(task1).when(dao).getTask(1);
        doReturn(taskList).when(dao).getAllTasks();
        doReturn(taskList).when(dao).getTasksByCategory("Java Boot Camp");
    }

    private void setUpRestTemplateMock() {

        restTemplate = mock(RestTemplate.class);

        doReturn("BOGO large 2 topping pizzas!").when(restTemplate).getForObject("http://localhost:6107/ad", String.class);
    }

    private void setUpDiscoveryClientMock() {

        discoveryClient = mock(DiscoveryClient.class);

        // discoveryClient returns a LinkedList of DefaultServiceInstances with hostName and portNumber
        List<ServiceInstance> instances = new LinkedList<>();

        DefaultServiceInstance defaultServiceInstance = new DefaultServiceInstance("","","localhost",6107,true);

        instances.add(defaultServiceInstance);

        doReturn(instances).when(discoveryClient).getInstances("adserver-service");
    }
}