package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String userInput;
        float number;

        do {
            System.out.println("Enter a number between 15 and 32: ");
            userInput = myScanner.nextLine();
            number = Float.parseFloat(userInput);

        } while (number <= 15 || number >= 32);
        System.out.println("Your number is " + number + ".");
    }
}
