package com.company;

import java.util.Scanner;

public class CountByThirteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int number;

        System.out.println("Enter a number: ");
        userInput = scanner.nextLine();
        number = Integer.parseInt(userInput);

        for (int i = 0; i <= number; i += 13) {
            System.out.println(i);
        }
    }
}