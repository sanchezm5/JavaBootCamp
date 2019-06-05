/*
A Number-Guessing Game:
    Modify your number-guessing game to actually pick a random number from 1 to 10
    and have the user try to guess that. Tell them if they get it right or wrong,
    and if they get it wrong, show them what the random number was.
    They will still only get one try.
 */

package com.trilogyed;

import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Initialize the computer's guess to a random number between 1 and 10
        int computerGuess = random.nextInt(9) + 1;

        // Prompt the user to guess the number
        System.out.println("I'm thinking of a number from 1 to 10. Guess what number it is:");
        String guessInput = scan.nextLine();
        int guess = Integer.parseInt(guessInput);

        // Display the user's guess
        System.out.println("Your guess: " + guess);

        // Display a message if the user gets the guess right or wrong
        if (guess != computerGuess) {
            System.out.println("Sorry, but I was really thinking of " + computerGuess + ".");
        } else {
            System.out.println("That's right! My secret number was " + computerGuess + "!");
        }
    }
}
