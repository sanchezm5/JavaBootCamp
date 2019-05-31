package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int userInt;

        System.out.println("Enter an integer: ");
        userInput = scanner.nextLine();
        userInt = Integer.parseInt(userInput);

        if (userInt % 2 == 0) {
            System.out.println(userInt + " is even.");
        } else {
            System.out.println(userInt + " is odd.");
        }
    }
}
