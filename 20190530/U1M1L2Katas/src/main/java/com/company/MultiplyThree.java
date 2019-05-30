package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String firstInput, secondInput, thirdInput;

        float num1, num2, num3;

        System.out.println("Enter a number: ");
        firstInput = myScanner.nextLine();
        System.out.println("Enter a second number: ");
        secondInput = myScanner.nextLine();
        System.out.println("Enter a third number: ");
        thirdInput = myScanner.nextLine();

        num1 = Float.parseFloat(firstInput);
        num2 = Float.parseFloat(secondInput);
        num3 = Float.parseFloat(thirdInput);

        float product = num1 * num2 * num3;

        System.out.println("The product of your three number is " + product + ".");

    }
}