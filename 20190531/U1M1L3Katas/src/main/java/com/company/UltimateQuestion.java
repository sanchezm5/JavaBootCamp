package com.company;

import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int userInt;

        do {
            System.out.println("Enter a number between 1 to 100");
            userInput = scanner.nextLine();
            userInt = Integer.parseInt(userInput);
        } while (userInt != 42);

        System.out.println("That's the number I was looking for! 42 is definitely the answer!");
    }
}
