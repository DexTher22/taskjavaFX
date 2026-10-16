package com.example.models;

public class Task {
    private String id;
    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correct;
    public Task() {
    }
    public Task(String id,String question, String answer1, String answer2, String answer3, String answer4, String correct) {
        this.id = id;
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correct = correct;
    }

    
}
