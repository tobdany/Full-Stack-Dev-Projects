package com.speakLikeFish.app.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.speakLikeFish.app.models.Topic;

@Service
public class TopicService {

    private final List<Topic> topicBank = new ArrayList<>();

    public TopicService() {
        // When the service starts, we populate some test topics in English
        topicBank.add(new Topic(
            1L, 
            "Should AI be granted copyright for its creative works?", 
            "Advanced", 
            Arrays.asList("copyright", "intellectual", "creativity", "algorithm", "ownership")
        ));
        
        topicBank.add(new Topic(
            2L, 
            "If you could colonize Mars but never return, would you go?", 
            "Medium", 
            Arrays.asList("spacecraft", "isolation", "survival", "planet", "colony")
        ));
    }

    public Topic getRandomTopic() {
        Random random = new Random();
        int index = random.nextInt(topicBank.size());
        return topicBank.get(index);
    }

    public List<Topic> getAllTopics() {
        return topicBank;
    }
}