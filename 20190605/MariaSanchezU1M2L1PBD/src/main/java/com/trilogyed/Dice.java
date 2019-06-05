/*
Dice:
    Write a program that simulates a dice roll by picking a random number from 1-6
    and then picking a second random number from 1-6. Add the two values together, and
    display the total.
*/

package com.trilogyed;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();

        // Initialize first and second rolls for the dice
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        // Find the sum of the rolls
        int total = dice1 + dice2;

        //Display each roll and the total
        System.out.println("HERE COMES THE DICE!");
        System.out.println("\n");
        System.out.println("Roll #1: " + dice1);
        System.out.println("Roll #2: " + dice2);
        System.out.println("The total is " + total + "!");
    }
}
