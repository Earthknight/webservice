package com.example.almtool.service;

import com.example.almtool.entities.Features;
import com.example.almtool.entities.Stories;
import com.example.almtool.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StoryService {

    @Autowired
    private StoryRepository storyRepository;
    public String createStory(Stories stories) {
        storyRepository.save(stories);
        return "Story Created Successfully";
    }

    public Optional<Stories> getStoryById(String id) {
        return storyRepository.findById(id);
    }
}
