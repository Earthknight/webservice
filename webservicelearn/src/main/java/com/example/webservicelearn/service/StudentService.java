package com.example.webservicelearn.service;

import com.example.webservicelearn.enity.StudentEnity;
import com.example.webservicelearn.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<StudentEnity> getStudents() {
        return studentRepository.findAll();
    }

    public void addStudents(StudentEnity studentEnity) {
        studentRepository.save(studentEnity);
    }

    public Optional<StudentEnity> getStudentsById(Integer id) {
        return studentRepository.findById(id);
    }

    public List<StudentEnity> getStudentswCand20() {
        return studentRepository.findStudentswCand20();
    }
}
