package com.todolist.service;

import com.todolist.entity.User;
import com.todolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }


    public User getUserById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteUser(int id){
        repository.deleteById(id);
        return "User deleted";
    }


}
