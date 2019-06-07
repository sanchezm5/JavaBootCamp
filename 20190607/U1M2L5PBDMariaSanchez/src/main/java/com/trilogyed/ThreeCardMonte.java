/*
Three Card Monte:
    This is the original "ball and cups" game where you try to find out which cup has the ball under it.
    You may play with three cups and a ball, three cards (two jacks and an ace), or three doors and a car.
    Basically, randomly select a cup to hide the "ball". Let the player guess which cup hides the ball.
    The player wins if they guess correctly.
 */

package com.trilogyed;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Initialize the cards array
        String[][] cards = {
                {"#", "#", "#"},
                {"#", "#", "#"},
                {"1", "2", "3"}
        };

        // Initialize a random number to represent the position (index) of the ace in the array
        int randomCard = random.nextInt(3);

        // Prompt user to guess which card is an ace given
        System.out.println("At Fast Eddie's card table, you plop down your cash.");
        System.out.println("He glances at you and starts shuffling. He lays down three cards." + "\n");
        System.out.println("Which one is the ace?");

        // Print out the cards array to display to the user with the hidden ace
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                System.out.print(cards[i][j] + " ");
            }
            System.out.println(" ");
        }

        // Read and convert the user's guess into an integer
        String userInput = scan.nextLine();
        int guess = Integer.parseInt(userInput);

        // Reassign the elements showing which column holds the ace
        cards[0][randomCard] = "A";
        cards[1][randomCard] = "A";

        // Display a message letting the user know whether or not Fast Eddie has won again
        if (guess != (randomCard + 1)) {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + (randomCard + 1));
        } else {
            System.out.println("You nailed it! Fast Eddie must hand over your winnings!");
        }

        // Finally, display the cards array showing the hidden ace
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                System.out.print(cards[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
