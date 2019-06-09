/*
Valid Number (Loops):
    This program prompts the user for a number between 1 and 10 and keeps asking until the entered number is in range.
    The program must do the following:
        -Prompt the user to enter a number between 1 and 10.
        -If the user enters a number less than 1 or greater than 10, display the following error message and prompt
         the user for another entry: "You must enter a number between 1 and 10, please try again."
        -When the user enters a valid number, print the number to the screen and exit.
*/

package com.trilogyed;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 10
        System.out.println("Enter a number between 1 and 10: ");

        // Read in the number the user enters and convert it to a float data type
        String userInput = scan.nextLine();
        float number = Float.parseFloat(userInput);

        // While the user's number is not within the given range, keep prompting the user to enter a valid number
        while (number < 1 || number > 10) {
            System.out.println("You must enter a number between 1 and 10, please try again.");

            // Again, read in the number the user enters and convert it to a float data type
            userInput = scan.nextLine();
            number = Float.parseFloat(userInput);
        }
        // Print the valid number the user has entered
        System.out.println("Your number is " + number + " and it is between 1 and 10.");
    }
}
