package com.example.almtool.service;

import com.example.almtool.entities.Features;
import com.example.almtool.repository.FeatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class FeatureService {

    @Autowired
    private FeatureRepository featureRepository;
    private  Features features;

    public String createFeature(Features features) {
        featureRepository.save(features);
        return "Feature Created Successfully";
    }

    public Optional<Features> getFeatureById(String id) {
        return featureRepository.findById(id);
    }
}
