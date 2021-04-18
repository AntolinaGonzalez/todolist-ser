package com.todolist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User", uniqueConstraints={@UniqueConstraint(columnNames = "username")})
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private String username;

    private String password;
}
