/*
Dice Doubles:
    Modify your dice game from last time so that it keeps rolling until they get doubles (the same number on both dice).
    Notice that since there's no user input, this will happen very quickly (all the rolls will happen one right after the other).
*/

package com.trilogyed;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random random = new Random();

        // Declare and initialize each dice equal to a random roll
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int sumOfDice = dice1 + dice2;

        System.out.println("HERE COMES THE DICE!" + "\n");

        // Print out the sum of the first roll
        System.out.println("Roll #1: " + dice1);
        System.out.println("Roll #2: " + dice2);
        System.out.println("The total is " + sumOfDice + "!" + "\n");

        // Continue rolling until the dice are equal
        // Display each roll and its sum
        while (dice1 != dice2) {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            sumOfDice = dice1 + dice2;
            System.out.println("Roll #1: " + dice1);
            System.out.println("Roll #2: " + dice2);
            System.out.println("The total is " + sumOfDice + "!" + "\n");
        }
    }
}

