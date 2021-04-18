package com.todolist.controller;

import com.todolist.entity.User;
import com.todolist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return service.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable int id){
        User user = service.getUserById(id);
        return user;
    }


    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }

}
