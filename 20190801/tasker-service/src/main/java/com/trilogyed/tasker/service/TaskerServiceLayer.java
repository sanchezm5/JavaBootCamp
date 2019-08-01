package com.trilogyed.tasker.service;

import com.trilogyed.tasker.dao.TaskerDao;
import com.trilogyed.tasker.model.Task;
import com.trilogyed.tasker.model.TaskViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskerServiceLayer {

    TaskerDao dao;

    @Autowired
    private DiscoveryClient discoveryClient;

    private RestTemplate restTemplate = new RestTemplate();

    @Value("${adserverServiceName}")
    private String adserverServiceName;

    @Value("${serviceProtocol}")
    private String serviceProtocol;

    @Value("${servicePath}")
    private String servicePath;

    @Autowired
    public TaskerServiceLayer(TaskerDao dao) {
        this.dao = dao;
    }

    public TaskerServiceLayer(TaskerDao dao, DiscoveryClient discoveryClient, RestTemplate restTemplate, String adserverServiceName, String serviceProtocol, String servicePath) {
        this.dao = dao;
        this.discoveryClient = discoveryClient;
        this.restTemplate = restTemplate;
        this.adserverServiceName = adserverServiceName;
        this.serviceProtocol = serviceProtocol;
        this.servicePath = servicePath;
    }

    public String serveAd(){

        List<ServiceInstance> instances = discoveryClient.getInstances(adserverServiceName);

        String adserverServiceUri = serviceProtocol + instances.get(0).getHost() + ":" + instances.get(0).getPort() + servicePath;

        // System.out.println(instances.get(0).getHost());

        String ad = restTemplate.getForObject(adserverServiceUri, String.class);

        return ad;
    }

    public TaskViewModel fetchTask(int id) {

        Task task = dao.getTask(id);
        TaskViewModel tvm = new TaskViewModel();

        tvm.setId(task.getId());
        tvm.setDescription(task.getDescription());
        tvm.setCreateDate(task.getCreateDate());
        tvm.setDueDate(task.getDueDate());
        tvm.setCategory(task.getCategory());

        // TODO - get ad from Adserver and put in tvm
        // For above step
        tvm.setAdvertisement(serveAd());

        return tvm;
    }

    public List<TaskViewModel> fetchAllTasks() {

        List<Task> taskList = dao.getAllTasks();
        List<TaskViewModel> taskViewModelList = new ArrayList<>();

        taskList.stream()
                .forEach(task -> {
                    TaskViewModel tvm = buildTaskViewModel(task);
                    taskViewModelList.add(tvm);
                });
        return taskViewModelList;
    }

    public List<TaskViewModel> fetchTasksByCategory(String category) {

        List<Task> taskList = dao.getTasksByCategory(category);
        List<TaskViewModel> taskViewModelList = new ArrayList<>();

        for (Task task : taskList) {
            taskViewModelList.add(buildTaskViewModel(task));         }

        return taskViewModelList;
    }

    public TaskViewModel newTask(TaskViewModel taskViewModel) {

        Task task = new Task();
        task.setDescription(taskViewModel.getDescription());
        task.setCreateDate(taskViewModel.getCreateDate());
        task.setDueDate(taskViewModel.getDueDate());
        task.setCategory(taskViewModel.getCategory());

        task = dao.createTask(task);
        taskViewModel.setId(task.getId());

        // TODO - get ad from Adserver and put in taskViewModel
        // For above step
        taskViewModel.setAdvertisement(serveAd());

        return taskViewModel;
    }

    public void deleteTask(int id) {
        dao.deleteTask(id);

    }

    public void updateTask(TaskViewModel taskViewModel) {

        Task task = new Task();

        task.setId(taskViewModel.getId());
        task.setDescription(taskViewModel.getDescription());
        task.setCreateDate(taskViewModel.getCreateDate());
        task.setDueDate(taskViewModel.getDueDate());
        task.setCategory(taskViewModel.getCategory());

        dao.updateTask(task);
    }

    private TaskViewModel buildTaskViewModel(Task task) {
        TaskViewModel tvm = new TaskViewModel();

        tvm.setId(task.getId());
        tvm.setDescription(task.getDescription());
        tvm.setCreateDate(task.getCreateDate());
        tvm.setDueDate(task.getDueDate());
        tvm.setCategory(task.getCategory());
        tvm.setAdvertisement(serveAd());

        return tvm;
    }
}
