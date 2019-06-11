/*
Baby Nim, aka Empty the Piles:
    Write a program that starts with three "piles" of 3 counters each. Let the player choose piles and remove counters
    until all the piles are empty.

        -Start by placing counters (coins or toothpicks or something) into 3 piles.
        -The player picks a pile, then removes one or more counters from that pile. (It's okay to take the whole pile.)
        -The player picks a new pile, then removes one or more counters from that pile. (It's okay to pick the same pile as before.)
        -Once all piles are empty, the game stops.
        -Note: You do not need to check for errors like a wrong pile name, or if someone tries to take more counters
         from the pile than the pile has.
 */
package com.company;

import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Initialize each of the starting piles
        int a = 3;
        int b = 3;
        int c = 3;

        // Display the starting piles of 3 counters
        System.out.println("Let's play Baby Nim!!!");
        System.out.println("A: 3\tB: 3\tC: 3\n");

        while (a > 0 || b > 0 || c > 0) {
            // Prompt the user to choose a pile
            System.out.print("Choose a pile: ");
            String userInput = scan.nextLine();

            // Prompt the user to enter how many to remove from the pile
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
        }
        // Display a message letting the user know when all piles have been emptied
        System.out.println("All piles are empty. Good job!");
    }
}
