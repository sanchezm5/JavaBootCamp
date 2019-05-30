package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String firstInput;
        String secondInput;
        String thirdInput;

        float firstNum;
        float secondNum;
        float thirdNum;

        System.out.println("Enter a number: ");
        firstInput  = myScanner.nextLine();
        System.out.println("Enter a second number: ");
        secondInput = myScanner.nextLine();
        System.out.println("Enter a third number: ");
        thirdInput = myScanner.nextLine();

        firstNum = Float.parseFloat(firstInput);
        secondNum = Float.parseFloat(secondInput);
        thirdNum = Float.parseFloat(thirdInput);

        float sum = firstNum + secondNum + thirdNum;
        float avg = sum / 3;

        System.out.printf("The average of your three numbers is %.2f.", avg);

    }
}
