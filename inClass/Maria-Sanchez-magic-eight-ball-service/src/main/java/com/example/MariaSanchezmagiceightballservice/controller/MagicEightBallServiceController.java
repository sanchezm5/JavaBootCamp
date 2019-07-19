package com.example.MariaSanchezmagiceightballservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RefreshScope
public class MagicEightBallServiceController {
    // holds our magic eight ball answers
    private List<String> answerList = new ArrayList<>();
    // random generator to return an answer
    private Random rndGenerator = new Random();

    public MagicEightBallServiceController() {

        // some answers
        answerList.add("No");
        answerList.add("Yes");
        answerList.add("Looking cloudy");
        answerList.add("Not sure");
        answerList.add("Absolutely");
        answerList.add("Ask again");
        answerList.add("Ummm");
        answerList.add("Not a chance");
    }

    @RequestMapping(value = "/eightballanswer", method = RequestMethod.GET)
    public String getMagicEightBallAnswer() {

        // select and return a random answer
        int whichAnswer = rndGenerator.nextInt(8);
        return answerList.get(whichAnswer);
    }







}


