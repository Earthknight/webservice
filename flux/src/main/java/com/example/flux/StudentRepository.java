package com.example.flux;

import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface StudentRepository extends ReactiveCrudRepository<Student,Integer> {

    @Modifying
    @Query("INSERT INTO studentfluxtable VALUES (:id,:name,:age)")
    public Mono<Student> addStudentDetail( @Param("id") Integer id,@Param("name") String name ,@Param("age") Integer age);
}
