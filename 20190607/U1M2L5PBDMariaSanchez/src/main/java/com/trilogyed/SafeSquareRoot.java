/*
Safe Square Root:
    Write a program to take the square root of a number typed in by the user. Your program should use a loop to ensure
    that the number they typed in is positive. If the number is negative, you should print out some sort of warning and
    make them type it in again. You can get the square root of a number n with Math.sqrt(n). Make sure you don't do this
    until the loop is done and you know for sure you've got a positive number.
 */
package com.trilogyed;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("SQUARE ROOT!");

        // Prompt the user to enter a number, read the number, and convert it to a double data type
        System.out.print("Enter a number: ");
        String userInput = scanner.nextLine();
        double number = Double.parseDouble(userInput);

        // While the number is negative, keep prompting the user to enter a non-negative number
        while (number < 0) {
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.print("Try again: ");
            userInput = scanner.nextLine();
            number = Double.parseDouble(userInput);
        }

        // Display the square root of the non-negative number
        System.out.println("The square root of " + number + " is " + Math.sqrt(number) + ".");
    }
}
