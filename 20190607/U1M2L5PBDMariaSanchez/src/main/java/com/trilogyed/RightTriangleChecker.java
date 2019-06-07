/*
Right Triangle Checker:
    Write a program to allow the user to enter three integers. You must use do-while or while loops to enforce
    that these integers are in ascending order, though duplicate numbers are allowed. Tell the user whether or not these
    integers would represent the sides of a right triangle.
*/

package com.trilogyed;

import java.util.Scanner;

public class RightTriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String userInput;
        int a, b, c;

        // Prompt user to enter three integers
        System.out.println("Enter three integers: ");

        // Display the first side measure
        userInput = scanner.nextLine();
        a = Integer.parseInt(userInput);
        System.out.println("Side 1:  " + a);

        // Check to make sure that the first side measure is positive
        while (a <= 0) {
            System.out.println("Any side of a triangle must have a positive measure.");
            System.out.println("Please enter a positive integer.");
            userInput = scanner.nextLine();
            a = Integer.parseInt(userInput);
            System.out.println("Side 1:  " + a);
        }

        // Display the second side measure
        userInput = scanner.nextLine();
        b = Integer.parseInt(userInput);
        System.out.println("Side 2:  " + b);

        // If the second side measure is less than the first side measure, keep prompting the user to enter another integer
        while (b < a) {
            System.out.println(b + " is smaller than " + a + ". Try again.");
            userInput = scanner.nextLine();
            b = Integer.parseInt(userInput);
            System.out.println("Side 2:  " + b);
        }

        // Display the third side measure
        userInput = scanner.nextLine();
        c = Integer.parseInt(userInput);
        System.out.println("Side 3:  " + c);

        // If the third side measure is less that the second side measure, keep prompting the user to enter another integer
        while (c < b) {
            System.out.println(c + " is smaller than " + b + ". Try again.");
            userInput = scanner.nextLine();
            c = Integer.parseInt(userInput);
            System.out.println("Side 3:  " + c);
        }

        // Display the three side measures for the user
        System.out.println("Your three sides are " + a + " " + b + " " + c);

        // Determine whether or not the sides would represent a right triangle by using the Converse of the Pythagorean Theorem
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            System.out.println("These sides DO make a right triangle. Yippy-skippy!");
        } else {
            System.out.println("These sides DO NOT make a right triangle!");
        }
    }
}
