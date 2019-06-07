/*
Adding Values in a Loop:
    Write a program that gets several integers from the user. Sum up all the integers they give you.
    Stop looping when they enter a 0. Display the total at the end.
*/

package com.trilogyed;

import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        // Prompt the user to enter an integer
        System.out.println("I will add up the numbers you give me. Enter an integer to begin: ");

        // Read the user input, convert it to an integer, and display the number entered
        String userInput = scanner.nextLine();
        int number = Integer.parseInt(userInput);
        System.out.println("Number: " + number);

        // Add the number entered to the sum and display the total
        sum += number;
        System.out.println("The total so far is " + sum);

        // While the user enters a number other than 0, continue to display the number and the sum
        while (number != 0) {
            userInput = scanner.nextLine();
            number = Integer.parseInt(userInput);
            System.out.println("Number: " + number);
            sum += number;
            System.out.println("The total so far is " + sum);
        }

        // When the user enters a 0, display the total
        System.out.println("\n" + "The total is " + sum + ".");
    }
}
