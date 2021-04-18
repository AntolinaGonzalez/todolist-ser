package com.todolist.controller;

import com.todolist.entity.Task;
import com.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService service;

    @CrossOrigin
    @PostMapping("/task")
    public Task addTask(@RequestBody Task task){
        return service.saveTask(task);
    }

    @CrossOrigin
    @GetMapping("/tasks")
    public List<Task> findAllTasks(){
        return service.getTasks();
    }

    @CrossOrigin
    @GetMapping("/task/{id}")
    public Task findTaskById(@PathVariable  int id){
        return service.getTaskById(id);
    }
    @CrossOrigin
    @GetMapping("/tasks/{id}")
    public List<Task> findTaskByUser(@PathVariable  int id){
        return service.getUserTasks(id);
    }

    @CrossOrigin
    @GetMapping("/tasks/folder/{id}")
    public List<Task> findTaskByFolder(@PathVariable  int id){
        return service.getFolderTasks(id);
    }

    @CrossOrigin
    @PutMapping("/task")
    public Task updateTask(@RequestBody Task task){
        return service.updateTask(task);
    }

    @CrossOrigin
    @DeleteMapping("/task/{id}")
    public String deleteTask(@PathVariable int id){
        return service.deleteTask(id);
    }
}
