package com.example.webservicelearn.enity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studenttable")
public class StudentEnity {

    @Id
    @Column(name = "stud_id")
    private int stud_id;
    @Column(name = "stud_name")
    private String stud_name;
    @Column(name = "stud_age")
    private int stud_age;

    public StudentEnity() {
    }

    public StudentEnity(int stud_id, String stud_name, int stud_age) {
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.stud_age = stud_age;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public int getStud_age() {
        return stud_age;
    }

    public void setStud_age(int stud_age) {
        this.stud_age = stud_age;
    }

    @Override
    public String toString() {
        return "StudentEnity{" +
                "stud_id=" + stud_id +
                ", stud_name='" + stud_name + '\'' +
                ", stud_age=" + stud_age +
                '}';
    }
}
