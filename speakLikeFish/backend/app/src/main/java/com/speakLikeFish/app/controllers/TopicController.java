package com.speakLikeFish.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.speakLikeFish.app.models.Topic;
import com.speakLikeFish.app.services.TopicService;

@RestController
public class TopicController {
    
    private final TopicService topicService;

    public TopicController(TopicService topicService){
        this.topicService = topicService;
    }

    @GetMapping("/topics")
    public List<Topic> listTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/hello")
    public String greet() {
        return "Hello! The SpeakLikeFish backend is responding correctly.";
    }
}