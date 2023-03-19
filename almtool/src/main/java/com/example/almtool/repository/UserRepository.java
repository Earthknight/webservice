package com.example.almtool.repository;

import com.example.almtool.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User,String> {

    @Query(value = "SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM users c WHERE c.username = :username AND c.password = :password",nativeQuery = true)
    public boolean checkUsernamePassword(@Param("username")String username,@Param("password") String password);

}
