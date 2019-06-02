package com.trilogyed;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to view all prime numbers listed up to that number: ");
        String userInput = scanner.nextLine();
        int number = Integer.parseInt(userInput);
        boolean prime;

        for (int i = 1; i <= number; i++) {
            prime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }

    }

}

