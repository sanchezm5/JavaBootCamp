/**
 * This web service is a quote-of-the-day, word-of-the-day, and magic 8-ball service.
 * You must implement and document the following REST APIs:
 *
 * Quote API--> URI: /quote, Method: GET, Request Body: None, Response Body: Quote
 * Quote Object: Author, Quote
 *
 * Word API--> URI: /word, Method: GET, Request Body: None, Response Body: Definition
 * Definition Object: Word, Definition
 *
 * Magic 8-ball API--> URI: /magic, Method: POST, Request Body: Question, Response Body: Answer
 * Answer Object: Question, Answer
 *
 * Additional Requirements:
 * Your service must contain at least 10 quotes. Quotes must be served up at random.
 * Your service must contain at least 10 words and their corresponding definitions.
 * Words and definitions must be served up at random.
 * Your service must contain at least 6 different magic 8-ball responses. 8-ball answers must be served up at random.
 */

package com.company.U1M4SummativeSanchezMaria.controller;

import com.company.U1M4SummativeSanchezMaria.model.Answer;
import com.company.U1M4SummativeSanchezMaria.model.Definition;
import com.company.U1M4SummativeSanchezMaria.model.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class APIController {

    Random random = new Random();

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getQuote() {

        // Create an arrayList to hold ten quotes with authors
        List<Quote> quoteList = new ArrayList<>();

        // Instantiate each book quote object and add it to the list of quotes
        Quote quote1 = new Quote();
        quote1.setAuthor("J.R.R. Tolkien");
        quote1.setQuote("Not all those who wander are lost.");
        quoteList.add(quote1);

        Quote quote2 = new Quote();
        quote2.setAuthor("Victor Hugo");
        quote2.setQuote("Even the darkest night will end and the sun will rise.");
        quoteList.add(quote2);

        Quote quote3 = new Quote();
        quote3.setAuthor("Peter Pan");
        quote3.setQuote("For to have faith is to have wings.");
        quoteList.add(quote3);

        Quote quote4 = new Quote();
        quote4.setAuthor("Charlotte Bronte");
        quote4.setQuote("I would always rather be happy than dignified.");
        quoteList.add(quote4);

        Quote quote5 = new Quote();
        quote5.setAuthor("Mary Shelley");
        quote5.setQuote("Beware for I am fearless, and therefore powerful.");
        quoteList.add(quote5);

        Quote quote6 = new Quote();
        quote6.setAuthor("Lewis Carroll");
        quote6.setQuote("I can’t go back to yesterday because I was a different person then.");
        quoteList.add(quote6);

        Quote quote7 = new Quote();
        quote7.setAuthor("Stephenie Meyer");
        quote7.setQuote("His gold eyes grew very soft. “You said you loved me.”");
        quoteList.add(quote7);

        Quote quote8 = new Quote();
        quote8.setAuthor("Roald Dahl");
        quote8.setQuote("If you have good thoughts they will shine out on your face like sunbeams and you will always look lovely.");
        quoteList.add(quote8);

        Quote quote9 = new Quote();
        quote9.setAuthor("Frances Hodgson Burnett");
        quote9.setQuote("If you look the right way, you can see the whole world is a garden.");
        quoteList.add(quote9);

        Quote quote10 = new Quote();
        quote10.setAuthor("Ernest Hemingway");
        quote10.setQuote("Isn’t it pretty to think so?");
        quoteList.add(quote10);

        // Get a random quote from the list and return it
        Quote randomQuote = quoteList.get(random.nextInt(10));
        return randomQuote;
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getDefinition() {

        // Create an arrayList to hold ten words with definitions
        List<Definition> defnList = new ArrayList<>();

        // Instantiate each book quote object and add it to the list of quotes
        Definition word1 = new Definition();
        word1.setWord("assign");
        word1.setDefinition("To set the data of a variable (involves the equal sign)");
        defnList.add(word1);

        Definition word2 = new Definition();
        word2.setWord("class");
        word2.setDefinition("A special type of instance method that creates a new object. In Java, constructors have the same name as their class and have no return value in their declaration.");
        defnList.add(word2);

        Definition word3 = new Definition();
        word3.setWord("constructor");
        word3.setDefinition("To set the data of a variable (involves the equal sign)");
        defnList.add(word3);

        Definition word4 = new Definition();
        word4.setWord("initialize");
        word4.setDefinition("An assignment that sets the starting value of a variable");
        defnList.add(word4);

        Definition word5 = new Definition();
        word5.setWord("instantiate");
        word5.setDefinition("To allocate storage for an object in memory (involves the keyword new)");
        defnList.add(word5);

        Definition word6 = new Definition();
        word6.setWord("method");
        word6.setDefinition("A collection of code found within a class. If the data members of a class are nouns, the methods are the verbs (the action).");
        defnList.add(word6);

        Definition word7 = new Definition();
        word7.setWord("object");
        word7.setDefinition("The principal code building block of Java programs. Each object in a program consists of both variables (data) and methods (functionality).");
        defnList.add(word7);

        Definition word8 = new Definition();
        word8.setWord("parameter");
        word8.setDefinition("A variable or object passed into a method");
        defnList.add(word8);

        Definition word9 = new Definition();
        word9.setWord("primitive");
        word9.setDefinition("A variable defined with a primitive data type: byte, short, int, long, float, double, char, or boolean.");
        defnList.add(word9);

        Definition word10 = new Definition();
        word10.setWord("typecast");
        word10.setDefinition("(1) To demote a variable from a larger capacity data type to a smaller one. (2) To re-establish the class of an object. The cast associates itself with the expression to its immediate right.");
        defnList.add(word10);

        // Get a random definition from the list and return it
        Definition randomDefn = defnList.get(random.nextInt(10));
        return randomDefn;
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer createAnswer(@RequestBody @Valid Answer answer) {
        // Create an arrayList to hold ten words with definitions
        List<Answer> answerList = new ArrayList<>();

        // Instantiate each book quote object and add it to the list of quotes
        Answer answer1 = new Answer();
        answer1.setQuestion(answer.getQuestion());
        answer1.setAnswer("It is certain");
        answerList.add(answer1);

        Answer answer2 = new Answer();
        answer2.setQuestion(answer.getQuestion());
        answer2.setAnswer("Yes--definitely");
        answerList.add(answer2);

        Answer answer3 = new Answer();
        answer3.setQuestion(answer.getQuestion());
        answer3.setAnswer("Ask again later");
        answerList.add(answer3);

        Answer answer4 = new Answer();
        answer4.setQuestion(answer.getQuestion());
        answer4.setAnswer("Most likely");
        answerList.add(answer4);

        Answer answer5 = new Answer();
        answer5.setQuestion(answer.getQuestion());
        answer5.setAnswer("Don't count on it");
        answerList.add(answer5);

        Answer answer6 = new Answer();
        answer6.setQuestion(answer.getQuestion());
        answer6.setAnswer("Not a chance");
        answerList.add(answer6);

        // Get a random definition from the list and return it
        Answer randomAnswer = answerList.get(random.nextInt(6));
        return randomAnswer;
    }
}
