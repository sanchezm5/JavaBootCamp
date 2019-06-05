/*
Hi-Lo with Limited Tries:
    Write a program that picks a random number from 1-100. The user keeps guessing as long as their guess
    is wrong, and they've guessed less than 7 times. If their guess is higher than the number, say "Too high."
    If their guess is lower than the number, say "Too low." When they get it right, the game stops. Or, if
    they hit seven guesses, the game stops even if they never got it right.
*/

package com.trilogyed;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Initialize the randomly-chosen computer number from 1 to 100
        int computerNumber = random.nextInt(100) + 1;
        System.out.println(computerNumber);

        // Declare a variable for the number of guesses and initialize it to 0
        int guessCounter = 0;

        // Prompt the user to guess the random number, giving them 7 tries
        System.out.println("I'm thinking of a number between 1 and 100. You have 7 guesses.");
        String userInput = scan.nextLine();
        int guess = Integer.parseInt(userInput);
        System.out.println("First guess: " + guess);

        // After the first guess, increment the number of guesses by 1
        guessCounter++;

        // If the user guesses incorrectly, keep prompting the user to guess
        // again until the 7th guess is entered or they win
        while (guess != computerNumber && guessCounter <= 7) {
            if (guessCounter == 7) {
                System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
                break;
            } else {

                // Give the user hints by specifying whether or not the guess is "Too high" or "Too low"
                if (guess < computerNumber) {
                    System.out.println("Sorry, you are too low. Try again.");
                } else {
                    System.out.println("Sorry, you are too high. Try again.");
                }
                userInput = scan.nextLine();
                guess = Integer.parseInt(userInput);

                // Each time the user guesses, increment the number of guesses by 1
                guessCounter++;

                // Display each guess along with the nth guess number
                System.out.println("Guess #" + guessCounter + ": " + guess);
            }
        }

        // As long as the user has not entered more than 7 guesses and they've guessed correctly, they win
        if (guessCounter <= 7 && guess == computerNumber) {
            System.out.println("You guessed it! What are the odds?!?");
        }
    }
}

