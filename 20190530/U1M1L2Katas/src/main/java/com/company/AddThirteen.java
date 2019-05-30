package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String input;

        float number;

        System.out.println("Enter a number: ");
        input = myScanner.nextLine();

        number = Float.parseFloat(input);
        float result = number + 13;

        System.out.println("The sum of your number and thirteen is " + result + ".");
    }
}
