package com.todolist.repository;

import com.todolist.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Integer> {

    List<Folder> getFolderByUser(int user);
}
