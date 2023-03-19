package com.example.almtool.repository;

import com.example.almtool.entities.Stories;
import org.springframework.data.repository.CrudRepository;

public interface StoryRepository extends CrudRepository<Stories,String> {
}
