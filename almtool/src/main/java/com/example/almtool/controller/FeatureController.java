package com.example.almtool.controller;


import com.example.almtool.dto.FeatureCreate;
import com.example.almtool.entities.Features;
import com.example.almtool.service.FeatureService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/alm/feature")
public class FeatureController {
    @Autowired
    FeatureService featureService;

    @PostMapping("/create")
      public String createFeature(@RequestBody Features features){
        return featureService.createFeature(features);
    }

    @GetMapping("/{featureid}")
    public Optional<Features> createFeature(@PathVariable("featureid") String id){
        return featureService.getFeatureById(id);
    }
}
