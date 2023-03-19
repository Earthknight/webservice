package com.example.almtool.entities;


import jakarta.persistence.*;
import lombok.*;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "userid")
    private String user_id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @ManyToOne
    private Team team;
}
