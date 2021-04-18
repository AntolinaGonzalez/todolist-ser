package com.todolist.service;

import com.todolist.entity.Folder;
import com.todolist.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolderService {
    @Autowired
    private FolderRepository repository;

    public Folder saveFolder(Folder folder){
        return repository.save(folder);
    }

    public List<Folder> getFolders(){
        return repository.findAll();
    }

    public Folder getFolderById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteFolder(int id){
        repository.deleteById(id);
        return "Folder deleted";
    }

    public Folder updateTask(Folder folder){
        Folder oldFolder = repository.findById(folder.getId()).orElse(null);
        oldFolder.setName(folder.getName());
        return repository.save(oldFolder);
    }


    public List<Folder> getFolderByUser(int user){
        return repository.getFolderByUser(user);
    }
}
