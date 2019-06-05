/*
Number-Guessing with a Counter:
    Modify your previous number-guessing game so that they can guess until they get it right AND count
    the number of tries it takes them to guess it.
*/

package com.trilogyed;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Initialize the randomly-chosen computer number from 1 to 10
        int computerNumber = random.nextInt(10) + 1;

        // Declare a variable for the number of guesses and initialize it to 0
        int guessCounter = 0;

        // Prompt the user to guess the random number
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        String userInput = scan.nextLine();
        int guess = Integer.parseInt(userInput);

        // After the first guess, increment the number of guesses by 1
        guessCounter++;

        // If the user guesses incorrectly, keep prompting the user to guess again
        while (guess != computerNumber) {
            System.out.println("Your guess: " + guess);
            System.out.println("That is incorrect. Guess again.");
            userInput = scan.nextLine();
            guess = Integer.parseInt(userInput);

            // Each time the user guesses, increment the number of guesses by 1
            guessCounter++;
        }

        System.out.println("That's right! Your a good guesser.");
        System.out.println("It only took you " + guessCounter + " tries.");
    }
}


