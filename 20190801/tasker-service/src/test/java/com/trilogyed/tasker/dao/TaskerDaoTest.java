package com.trilogyed.tasker.dao;

import com.trilogyed.tasker.model.Task;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskerDaoTest {

    @Autowired
    TaskerDao taskerDao;

    @Before
    public void setUp() throws Exception {

        List<Task> tasks = taskerDao.getAllTasks();
        for (Task task: tasks) {
            taskerDao.deleteTask(task.getId());
        }
    }

    @Test
    public void createGetDeleteTask() {

        Task task = new Task();
        task.setDescription("Complete summative");
        task.setCreateDate(LocalDate.of(2019, 7, 27));
        task.setDueDate(LocalDate.of(2019, 7, 31));
        task.setCategory("Java Boot Camp");

        task = taskerDao.createTask(task);

        Task task1 = taskerDao.getTask(task.getId());
        assertEquals(task1, task);

        taskerDao.deleteTask(task.getId());

        task1 = taskerDao.getTask(task.getId());
        assertNull(task1);
    }

    @Test
    public void getAllTasks() {

        Task task = new Task();
        task.setDescription("Complete summative");
        task.setCreateDate(LocalDate.of(2019, 7, 27));
        task.setDueDate(LocalDate.of(2019, 7, 31));
        task.setCategory("Java Boot Camp");
        task = taskerDao.createTask(task);

        task = new Task();
        task.setDescription("Complete group project");
        task.setCreateDate(LocalDate.of(2019, 7, 24));
        task.setDueDate(LocalDate.of(2019, 7, 31));
        task.setCategory("Java Boot Camp");
        task = taskerDao.createTask(task);

        List<Task> taskList = taskerDao.getAllTasks();
        assertEquals(2, taskList.size());

    }

    @Test
    public void getTasksByCategory() {

        Task task = new Task();
        task.setDescription("Complete summative");
        task.setCreateDate(LocalDate.of(2019, 7, 27));
        task.setDueDate(LocalDate.of(2019, 7, 31));
        task.setCategory("Java Boot Camp");
        task = taskerDao.createTask(task);

        Task task1 = new Task();
        task1.setDescription("Complete group project");
        task1.setCreateDate(LocalDate.of(2019, 7, 24));
        task1.setDueDate(LocalDate.of(2019, 8, 1));
        task1.setCategory("Java Boot Camp");
        task1 = taskerDao.createTask(task1);

        List<Task> taskList = taskerDao.getTasksByCategory(task.getCategory());
        assertEquals(2, taskList.size());
    }

    @Test
    public void updateTask() {

        Task task = new Task();
        task.setDescription("Complete summative");
        task.setCreateDate(LocalDate.of(2019, 7, 27));
        task.setDueDate(LocalDate.of(2019, 7, 31));
        task.setCategory("Java Boot Camp");
        task = taskerDao.createTask(task);

        task.setDescription("Complete Summative 7");
        taskerDao.updateTask(task);

        Task task1 = taskerDao.getTask(task.getId());
        assertEquals(task1, task);
    }

    @Test
    public void deleteTask() {

        Task task = new Task();
        task.setDescription("Complete summative");
        task.setCreateDate(LocalDate.of(2019, 7, 27));
        task.setDueDate(LocalDate.of(2019, 7, 31));
        task.setCategory("Java Boot Camp");
        task = taskerDao.createTask(task);

        taskerDao.deleteTask(task.getId());
        Task task1 = taskerDao.getTask(task.getId());
        assertNull(task1);
    }
}