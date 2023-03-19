package com.example.almtool.controller;

import com.example.almtool.entities.Features;
import com.example.almtool.entities.Stories;
import com.example.almtool.service.FeatureService;
import com.example.almtool.service.StoryService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/alm/stories")
public class StoryController{
    @Autowired
    StoryService storyService;

    @PostMapping("/create")
    public String createFeature(@RequestBody Stories stories){
        return storyService.createStory(stories);
    }

    @GetMapping("/{featureid}")
    public Optional<Stories> createFeature(@PathVariable("featureid") String id){
        return storyService.getStoryById(id);
    }
}
