package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        Random randomNum = new Random();

        String userInput;

        int computerNum = randomNum.nextInt(99) + 1;
        int userGuess;
        int counter = 0;

        System.out.println("Welcome to Hi-Low!");
        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();
        System.out.println("OK, " + name + ", here are the rules:");
        System.out.println(computerNum);

        do {
            System.out.println("Guess a number between 1 and 100");
            userInput = myScanner.nextLine();
            userGuess = Integer.parseInt(userInput);

            if (userGuess < computerNum) {
                System.out.println("Too low!");
            }
            if (userGuess > computerNum) {
                System.out.println("Too high!");
            }

            counter++;

        } while (computerNum != userGuess);

        System.out.println("Congratulations, " + name + "! You win!");
        System.out.println("It took you " + counter + " guesses to find my number!");
        System.out.println(counter);


    }
}
