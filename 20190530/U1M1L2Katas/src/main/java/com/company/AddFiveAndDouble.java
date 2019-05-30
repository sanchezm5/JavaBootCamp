package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String input;

        float number;

        System.out.println("Enter a number: ");
        input = myScanner.nextLine();

        number = Float.parseFloat(input);
        float result = (number + 5) * 2;

        System.out.println("The result of adding five and then doubling your number is " + result + ".");
    }
}
