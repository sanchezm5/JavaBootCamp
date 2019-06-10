/*
Month Converter (Conditionals):
    This program converts a number entered by the user into a month using if/else/else-if structure.
    The program must do the following:

        -Prompt the user to enter a number between 1 and 12.
        -Print out the name of the month corresponding to the number typed in by the user.
        -Print out the following error message if the user enters a number less than 1 or greater than 12:
         "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye."
 */

package com.trilogyed;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 12
        System.out.println("Enter a number between 1 and 12, which corresponds to any month of the year: ");
        String userInput = scanner.nextLine();
        int monthNumber = Integer.parseInt(userInput);

        // Declare a variable to represent the month converter message to be printed out to the user
        String monthMessage = "Your number corresponds to the month of ";

        // Using if/else/else-if logic, match the number entered with the correct corresponding month and print it out for the user
        if (monthNumber == 1) {
            System.out.println(monthMessage + "January.");
        } else if (monthNumber == 2) {
            System.out.println(monthMessage + "February.");
        } else if (monthNumber == 3) {
            System.out.println(monthMessage + "March.");
        } else if (monthNumber == 4) {
            System.out.println(monthMessage + "April.");
        } else if (monthNumber == 5) {
            System.out.println(monthMessage + "May.");
        } else if (monthNumber == 6) {
            System.out.println(monthMessage + "June.");
        } else if (monthNumber == 7) {
            System.out.println(monthMessage + "July.");
        } else if (monthNumber == 8) {
            System.out.println(monthMessage + "August.");
        } else if (monthNumber == 9) {
            System.out.println(monthMessage + "September.");
        } else if (monthNumber == 10) {
            System.out.println(monthMessage + "October.");
        } else if (monthNumber == 11) {
            System.out.println(monthMessage + "November.");
        } else if (monthNumber == 12) {
            System.out.println(monthMessage + "December.");

            // Print an error message if the user enters an invalid entry
        } else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}
