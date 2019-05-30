package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String firstInput;
        String secondInput;

        float firstNumber;
        float secondNumber;

        System.out.println("Enter a number: ");
        firstInput = myScanner.nextLine();
        System.out.println("Enter a second number: ");
        secondInput = myScanner.nextLine();

        firstNumber = Float.parseFloat(firstInput);
        secondNumber = Float.parseFloat(secondInput);

        float difference = firstNumber - secondNumber;

        System.out.println("The difference of the numbers is " + difference + ".");
    }
}
