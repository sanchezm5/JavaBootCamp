/*
Keep Guessing:
    Modify your previous number-guessing game so that they can guess until they get it right.
    That means it will keep looping as long as the guess is different from the secret number.
    Use a while loop.
*/

package com.trilogyed;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Initialize the randomly-chosen computer number from 1 to 10
        int computerNumber = random.nextInt(10) + 1;

        // Prompt the user to guess the random number
        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        String userInput = scan.nextLine();
        int guess = Integer.parseInt(userInput);

        // If the user doesn't guess correctly, keep prompting the user to guess again
        while (guess != computerNumber) {
            System.out.println("Your guess: " + guess);
            System.out.println("That is incorrect. Guess again.");
            userInput = scan.nextLine();
            guess = Integer.parseInt(userInput);
        }

        // If the user guesses correctly, display a message
        System.out.println("That's right! You're a good guesser.");
    }
}
