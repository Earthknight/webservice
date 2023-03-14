package com.example.webservicelearn.repository;

import com.example.webservicelearn.enity.StudentEnity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<StudentEnity ,Integer> {

    @Query(value = "SELECT * FROM studenttable s WHERE s.stud_name LIKE 'C%' AND s.stud_age > 20", nativeQuery = true)
    List<StudentEnity> findStudentswCand20();

}
