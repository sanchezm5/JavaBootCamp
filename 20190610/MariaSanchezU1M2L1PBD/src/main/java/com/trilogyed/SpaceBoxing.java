/*
Space Boxing:
    Julio Cesar Chavez Mark VII is an interplanetary space boxer, who currently holds the championship belts
    for various weight categories on many different planets within our solar system. However, it is often difficult
    for him to recall what his "target weight" needs to be on earth in order to make the weight class on other planets.
    Write a program to help him keep track of this.

    It should ask him what his earth weight is, and to enter a number for the planet he wants to fight on.
    It should then compute his weight on the destination planet based on the table below:

    #	Planet	Relative gravity
    1	Venus	0.78
    2	Mars	0.39
    3	Jupiter	2.65
    4	Saturn	1.17
    5	Uranus	1.05
    6	Neptune	1.23
 */

package com.trilogyed;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the boxer to enter his weight and the planet he is visiting
        System.out.println("Please enter your current weight: ");
        String weightInput = scan.nextLine();
        float weight = Float.parseFloat(weightInput);

        System.out.println("I have information for the following planets: ");
        System.out.println("  1. Venus   2. Mars    3. Jupiter");
        System.out.println("  4. Saturn  5. Uranus  6. Neptune");
        System.out.println("Which planet are you visiting? (Enter the number)");
        String planetInput = scan.nextLine();
        float planet = Float.parseFloat(planetInput);

        // Initialize relative gravity to zero
        float relativeGravity = 0;

        // Reassign relative gravity based on which planet the boxer is visiting
        if (planet == 1) {
            relativeGravity = 0.78f;
        } else if (planet == 2) {
            relativeGravity = 0.39f;
        } else if (planet == 3) {
            relativeGravity = 2.65f;
        } else if (planet == 4) {
            relativeGravity = 1.17f;
        } else if (planet == 5) {
            relativeGravity = 1.05f;
        } else if (planet == 6) {
            relativeGravity = 1.23f;
        } else {
            System.out.println("Invalid entry, please try again. Goodbye.");
        }

        // Calculate the target weight and display it
        float targetWeight = weight * relativeGravity;
        System.out.printf("Your weight would be %.2f pounds on that planet.", targetWeight);
    }
}
