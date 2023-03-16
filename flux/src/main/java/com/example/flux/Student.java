package com.example.flux;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "studentfluxtable")
public class Student {
    @Id
    @Column("id")
    private Integer studId;
    @Column("name")
    private  String studname;
    @Column("age")
    private Integer studAge;
}
