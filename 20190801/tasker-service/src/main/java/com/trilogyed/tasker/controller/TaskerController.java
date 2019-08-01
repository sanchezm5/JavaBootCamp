package com.trilogyed.tasker.controller;

import com.trilogyed.tasker.model.TaskViewModel;
import com.trilogyed.tasker.service.TaskerServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;


@RestController
@RefreshScope
public class TaskerController {

    @Autowired
    TaskerServiceLayer service;

    @RequestMapping(value = "/tasks", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public TaskViewModel createTasks(@RequestBody @Valid TaskViewModel tasks) {
        return service.newTask(tasks);
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public TaskViewModel getTask(@PathVariable("id") int taskId) {
        TaskViewModel taskViewModel = service.fetchTask(taskId);
        if (taskViewModel == null) {
            throw new IllegalArgumentException("Tasks could not be retrieved for id " + taskId);
        }
        return taskViewModel;
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TaskViewModel> getAllTasks() {
        return service.fetchAllTasks();
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTask(@PathVariable("id") int taskId, @RequestBody @Valid TaskViewModel taskViewModel) {
        if (taskViewModel.getId() == 0) {
            taskViewModel.setId(taskId);
        }
        if (taskId != taskViewModel.getId()) {
            throw new IllegalArgumentException("Task ID on path must match the ID in the Task object");
        }
        service.updateTask(taskViewModel);
    }

    @RequestMapping(value = "/tasks/category/{category}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TaskViewModel> getTasksByCategory(@PathVariable("category") String category) {
        List<TaskViewModel> tasks = service.fetchTasksByCategory(category);
        if (tasks == null) {
            throw new IllegalArgumentException("Tasks could not be retrieved for category " + category);
        }
        return tasks;
    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable("id") int taskId) {
        service.deleteTask(taskId);
    }
}
