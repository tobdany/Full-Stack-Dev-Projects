package com.speakLikeFish.app.models;

import java.util.List;

public class Topic {
    private Long id;
    private String title;
    private String difficulty;
    private List<String> keywords;

    // Constructor
    public Topic(Long id, String title, String difficulty, List<String> keywords) {
        this.id = id;
        this.title = title;
        this.difficulty = difficulty;
        this.keywords = keywords;
    }

    // Getters and Setters 
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getDifficulty() { return difficulty; }
    public List<String> getKeywords() { return keywords; }
}