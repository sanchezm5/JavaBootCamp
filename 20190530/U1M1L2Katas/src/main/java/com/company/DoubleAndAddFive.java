package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String input;

        float number;

        System.out.println("Enter a number: ");
        input = myScanner.nextLine();

        number = Float.parseFloat(input);
        number = 2 * number + 5;

        System.out.println("The result of doubling your number and then adding five is " + number + ".");


    }
}
