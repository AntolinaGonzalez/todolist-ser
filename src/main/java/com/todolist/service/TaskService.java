package com.todolist.service;


import com.todolist.entity.Task;
import com.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public Task saveTask(Task task){
       return repository.save(task);
    }

    public List<Task> getTasks(){
        return repository.findAll();
    }

    public Task getTaskById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteTask(int id){
        repository.deleteById(id);
        return "task deleted";
    }

    public Task updateTask(Task task){
        Task oldTask = repository.findById(task.getId()).orElse(null);
        oldTask.setTitle(task.getTitle());
        oldTask.setPriority(task.getPriority());
        oldTask.setChecked(task.isChecked());
        return repository.save(oldTask);
    }

    public List<Task> getUserTasks(int id){
        return repository.findByUser(id);
    }

    public List<Task> getFolderTasks(int id){
        return repository.findByFolder(id);
    }
    public String deleteFolderTask(int folder){
        repository.deleteByFolder(folder);
        return "folder tasks deleted";
    }
}
