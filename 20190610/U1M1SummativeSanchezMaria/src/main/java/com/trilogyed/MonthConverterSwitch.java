/*
Month Converter (Conditionals):
    This program converts a number entered by the user into a month using a switch statement.
    The program must do the following:

        -Prompt the user to enter a number between 1 and 12.
        -Print out the name of the month corresponding to the number typed in by the user.
        -Print out the following error message if the user enters a number less than 1 or greater than 12:
         "You have entered an invalid number. You must enter a number between 1 and 12. Goodbye."
 */

package com.trilogyed;

import java.util.Scanner;

public class MonthConverterSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 12
        System.out.println("Enter a number between 1 and 12, which corresponds to any month of the year: ");
        String userInput = scanner.nextLine();
        int monthNumber = Integer.parseInt(userInput);

        // Declare a variable to represent the month converter message to be printed out to the user
        String monthMessage = "Your number corresponds to the month of ";

        // Using a switch statement, match the number entered with the correct corresponding month and print it
        switch (monthNumber) {
            case 1:
                System.out.println(monthMessage + "January.");
                break;
            case 2:
                System.out.println(monthMessage + "February.");
                break;
            case 3:
                System.out.println(monthMessage + "March.");
                break;
            case 4:
                System.out.println(monthMessage + "April.");
                break;
            case 5:
                System.out.println(monthMessage + "May.");
                break;
            case 6:
                System.out.println(monthMessage + "June.");
                break;
            case 7:
                System.out.println(monthMessage + "July.");
                break;
            case 8:
                System.out.println(monthMessage + "August.");
                break;
            case 9:
                System.out.println(monthMessage + "September.");
                break;
            case 10:
                System.out.println(monthMessage + "October.");
                break;
            case 11:
                System.out.println(monthMessage + "November.");
                break;
            case 12:
                System.out.println(monthMessage + "December.");
                break;
            default:
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}
