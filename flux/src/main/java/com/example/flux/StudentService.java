package com.example.flux;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Log4j2
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public Flux<Student> getAll(){
        Flux<Student> s = this.studentRepository.findAll();
        s.subscribe(System.out::println);
        System.out.println("all() method completed");
        return s;
    }

    @Transactional
    public Mono<Student> addStudent(Student student) {
        System.out.println(student.getStudId());
        return studentRepository.addStudentDetail(student.getStudId(),student.getStudname(),student.getStudAge());
    }
}
