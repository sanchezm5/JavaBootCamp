/*
Shorter Double Dice:
    Redo the Dice Doubles assignment (the dice program with a loop) so that it uses a do-while loop instead of a while loop.
    Otherwise it should behave exactly the same. If you do this correctly, there should be less code in this version.
 */
package com.trilogyed;

import java.util.Random;

public class ShorterDoubleDice {
    public static void main(String[] args) {
        Random random = new Random();

        // Declare variables
        int dice1;
        int dice2;

        System.out.println("HERE COMES THE DICE!" + "\n");

        // Continue rolling until the dice are equal
        // Display each roll and its sum
        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            int sumOfDice = dice1 + dice2;
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is " + sumOfDice + "!" + "\n");
        } while (dice1 != dice2);
    }
}
