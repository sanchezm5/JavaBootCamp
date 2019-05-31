package com.company;

import java.util.Scanner;

public class DoWhileClass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int userInt;

        do {
            System.out.println("Enter a number between 1 and 10.");
            userInput = myScanner.nextLine();
            userInt = Integer.parseInt(userInput);

        } while (userInt < 1 || userInt > 10);
    }
}
