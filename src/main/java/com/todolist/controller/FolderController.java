package com.todolist.controller;

import com.todolist.entity.Folder;
import com.todolist.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    private FolderService service;

    @CrossOrigin
    @PostMapping("/folder")
    public Folder addFolder(@RequestBody Folder folder){
        return service.saveFolder(folder);
    }

    @CrossOrigin
    @GetMapping("/folders")
    public List<Folder> findAllFolder(){
        return service.getFolders();
    }

    @CrossOrigin
    @GetMapping("/folder/{id}")
    public Folder findFolderById( @PathVariable int id){
        return service.getFolderById(id);
    }
    @CrossOrigin
    @GetMapping("/folders/{id}")
    public List<Folder> findFolderByUser( @PathVariable int id){
        return service.getFolderByUser(id);
    }

    @CrossOrigin
    @PutMapping("/folder")
    public Folder updateFolder(@RequestBody Folder folder){
        return service.updateTask(folder);
    }

    @CrossOrigin
    @DeleteMapping("/folder/{id}")
    public String deleteFolder(@PathVariable int id){
        return service.deleteFolder(id);
    }
}
