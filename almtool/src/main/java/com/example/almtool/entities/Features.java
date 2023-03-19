package com.example.almtool.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cascade;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "features")
public class Features {
    @Id
    @Column(name = "featureid")
    private String feature_id;
    @Column(name = "featuredescription")
    private String feature_description;
    @Column(name = "featuretitle")
    private String feature_title;
    @ManyToOne(cascade = CascadeType.ALL)
    private Team team;
}
