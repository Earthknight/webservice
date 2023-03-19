package com.example.almtool.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
@Table(name = "team")
public class Team {
    @Id
    @Column(name = "teamid")
    private String team_id;
    @Column(name = "teamname")
    private String teamname;
}
