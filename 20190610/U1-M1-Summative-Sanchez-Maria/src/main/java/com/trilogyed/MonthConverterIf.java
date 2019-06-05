package com.trilogyed;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer between 1 and 12: ");
        String userInput = scan.nextLine();
        int monthNumber = Integer.parseInt(userInput);

        if (monthNumber == 1) {
            System.out.println("January is the month corresponding to your number.");
        } else if (monthNumber == 2) {
            System.out.println("February is the month corresponding to your number.");

        } else if (monthNumber == 3) {
            System.out.println("March is the month corresponding to your number.");

        } else if (monthNumber == 4) {
            System.out.println("April is the month corresponding to your number.");

        } else if (monthNumber == 5) {
            System.out.println("May is the month corresponding to your number.");

        } else if (monthNumber == 6) {
            System.out.println("June is the month corresponding to your number.");

        } else if (monthNumber == 7) {
            System.out.println("July is the month corresponding to your number.");

        } else if (monthNumber == 8) {
            System.out.println("August is the month corresponding to your number.");

        } else if (monthNumber == 9) {
            System.out.println("September is the month corresponding to your number.");

        } else if (monthNumber == 10) {
            System.out.println("October is the month corresponding to your number.");

        } else if (monthNumber == 11) {
            System.out.println("November is the month corresponding to your number.");

        } else if (monthNumber == 12) {
            System.out.println("December is the month corresponding to your number.");

        } else {
            System.out.println("You must enter a number (integer) between 1 and 12. Goodbye.");
        }
    }
}
