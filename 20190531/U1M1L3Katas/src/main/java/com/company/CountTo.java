package com.company;

import java.util.Scanner;

public class CountTo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String userInput;
        int number;

        System.out.println("Enter a number: ");
        userInput = myScanner.nextLine();
        number = Integer.parseInt(userInput);

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
