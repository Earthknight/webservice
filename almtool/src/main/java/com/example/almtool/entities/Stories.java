package com.example.almtool.entities;

import jakarta.persistence.*;
import lombok.*;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stories")
public class Stories {
        @Id
        @Column(name = "storyid")
        private String story_id;
        @Column(name = "storyname")
        private String storyname;
        @Column(name = "description")
        private String description;
        @ManyToOne
        private Features features;
        @ManyToOne
        private  User user;
}

