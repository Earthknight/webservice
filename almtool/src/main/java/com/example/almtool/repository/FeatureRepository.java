package com.example.almtool.repository;

import com.example.almtool.entities.Features;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FeatureRepository extends CrudRepository<Features,String> {
}
