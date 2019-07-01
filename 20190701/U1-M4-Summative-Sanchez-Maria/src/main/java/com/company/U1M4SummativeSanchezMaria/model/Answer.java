package com.company.U1M4SummativeSanchezMaria.model;

import javax.validation.constraints.NotEmpty;

public class Answer {

    // Properties
    @NotEmpty(message = "You must supply a question for the magic-8-ball.")
    private String question;
    private String answer;

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
