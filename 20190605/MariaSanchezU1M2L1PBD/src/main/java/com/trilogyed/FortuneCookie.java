/*
Fortune Cookie:
    Write a program that simulates a random fortune from a fortune cookie. You must have at least six fortunes.
    For bonus points, also add randomly-chosen lotto numbers to the fortune. In Texas, the lotto chooses 6
    numbers, each from 1-54.
*/

package com.trilogyed;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random random = new Random();

        // Initialize 6 randomly chosen lotto numbers, each from 1 to 54
        int lotto1 = random.nextInt(54) + 1;
        int lotto2 = random.nextInt(54) + 1;
        int lotto3 = random.nextInt(54) + 1;
        int lotto4 = random.nextInt(54) + 1;
        int lotto5 = random.nextInt(54) + 1;
        int lotto6 = random.nextInt(54) + 1;

        // Declare a variable for the fortune, randomly selected from 1 to 6 messages
        int fortune = random.nextInt(6) + 1;
        String message;

        // Display the message that corresponds to the random fortune integer selected
        if (fortune == 1) {
            message = "You got this!";
        } else if (fortune == 2) {
            message = "If at first you don't succeed, try and try again!";
        } else if (fortune == 3) {
            message = "You are amazing!";
        } else if (fortune == 4) {
            message = "Never give up!";
        } else if (fortune == 5) {
            message = "Live, laugh, and love!";
        } else {
            message = "Dream big!";
        }

        // Finally, display the message for the fortune cookie along with the randomly-chosen lotto numbers
        System.out.println("Fortune cookie says: " + message);
        System.out.println("    " + lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    }
}
