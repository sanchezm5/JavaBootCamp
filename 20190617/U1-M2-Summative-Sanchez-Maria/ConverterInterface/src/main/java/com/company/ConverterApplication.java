package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Instantiate an instance for each of the ConverterIf and ConverterSwitch classes
        ConverterIf objIf = new ConverterIf();
        ConverterSwitch objSwitch = new ConverterSwitch();

        // Prompt the user to enter a number between 1 and 12 and convert it to an integer
        System.out.print("Enter a number between 1 and 12 that you wish to convert to a month: ");
        String userInput = scan.nextLine();
        int monthNumber = Integer.parseInt(userInput);

        // Invoke each method in the classes
        System.out.println(objIf.converterMonth(monthNumber));
        System.out.println(objSwitch.converterMonth(monthNumber));

        // Prompt the user to enter a number between 1 and 7 and convert it to an integer
        System.out.print("\nEnter a number between 1 and 7 that you wish to convert to a day of the week: ");
        userInput = scan.nextLine();
        int dayNumber = Integer.parseInt(userInput);

        // Invoke each method in the classes
        System.out.println(objIf.convertDay(dayNumber));
        System.out.println(objSwitch.convertDay(dayNumber));
    }
}
