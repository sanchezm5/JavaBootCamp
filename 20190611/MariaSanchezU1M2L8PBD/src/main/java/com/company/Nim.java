/*
Nim:
    Nim is a strategy game between two players.

    -Start by placing counters (coins or toothpicks or something) into 3 piles.
    -Player #1 picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
    -Player #2 picks a pile, then removes one or more counters from that pile.
    -Player #1 plays again. (It's okay to choose a different pile this time.)
    -Whichever player is forced to take the last counter is the LOSER.
    -Write a program that allows two human players to play Nim against each other. The program should detect when the
     last counter has been taken and declare a winner.

    -At first, don't worry about detecting cheating. That is one of the bonus options.
 */
package com.company;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize each of the starting piles
        int a = 3;
        int b = 4;
        int c = 5;


        // Declare variables to represent whose turn it is and to identify the current player
        boolean turn1 = true;
        String player;

        // Prompt players to enter their name
        System.out.println("Let's play Nim!!!!!");
        System.out.print("Player 1, enter your name: ");
        String p1Name = scan.nextLine();
        System.out.print("Player 2, enter your name: ");
        String p2Name = scan.nextLine();

        // Display the starting piles of 3 counters
        System.out.println("A: 3\tB: 4\tC: 5\n");

        while (a > 0 || b > 0 || c > 0) {

            // Identify who is the current player, starting with player 1
            if (turn1) player = p1Name;
            else player = p2Name;

            // Prompt the player to choose a pile
            System.out.print(player + ", choose a pile: ");
            String userInput = scan.nextLine();

            // Prompt the player to enter how many to remove from the pile
            System.out.print("How many to remove from pile " + userInput + ": ");
            String counterInput = scan.nextLine();

            // Convert the number to remove from pile into an integer
            int countToRemove = Integer.parseInt(counterInput);

            // Remove the number of counters from the pile specified
            if (userInput.equals("A")) {
                a -= countToRemove;
            }
            if (userInput.equals("B")) {
                b -= countToRemove;
            }
            if (userInput.equals("C")) {
                c -= countToRemove;
            }

            // Display the piles again with the updated changes
            System.out.println("A: " + a + "\tB: " + b + "\tC: " + c + "\n");

            // Alternate player1 and player2 turns
            turn1 = !turn1;
        }
        // Display a message letting the users know who has won
        if (turn1) {
            System.out.println(p1Name + " there are no counters left, so you WIN!!!!!");
        } else {
            System.out.println(p2Name + " there are no counters left, so you WIN!!!!!");
        }
    }
}
