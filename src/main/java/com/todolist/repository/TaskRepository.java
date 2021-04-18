package com.todolist.repository;

import com.todolist.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findByUser(int id);
    List<Task> findByFolder(int id);

    void deleteByFolder(int folder);
}
