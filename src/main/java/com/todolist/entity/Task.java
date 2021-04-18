package com.todolist.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String title;
    @NotNull
    private String priority;
    private boolean checked;
    @NotNull
    private int user;
    private int folder;

}
