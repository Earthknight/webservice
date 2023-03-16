package com.example.flux;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getALLstudents")
    public Flux<Student> getAllStudents(){
        return studentService.getAll();
    }

    @PostMapping("/addStudent")
    public Mono<Student> getAllStudents(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
