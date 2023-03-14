package com.example.webservicelearn.controller;


import com.example.webservicelearn.enity.StudentEnity;
import com.example.webservicelearn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    List<StudentEnity> getStudents(){
        return studentService.getStudents();
    }


    @GetMapping("/students/{id}")
    Optional<StudentEnity> getStudents(@RequestParam Integer id){
        return studentService.getStudentsById(id);
    }

    @GetMapping("/student/C")
    List<StudentEnity> getStudentswCand20(){
        return studentService.getStudentswCand20();
    }

    @GetMapping("/s")
    String wdwdw(){
        return "Hello";
    }


    @PostMapping("/students")
    void addStudents(@RequestBody StudentEnity studentEnity){
         studentService.addStudents(studentEnity);
    }
}
