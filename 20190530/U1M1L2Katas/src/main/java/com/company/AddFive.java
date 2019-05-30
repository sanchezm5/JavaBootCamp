package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String firstInput;
        String secondInput;
        String thirdInput;
        String fourthInput;
        String fifthInput;

        //float num1;
        float num1;
        float num2;
        float num3;
        float num4;
        float num5;

        System.out.println("Enter a number: ");
        firstInput = myScanner.nextLine();
        System.out.println("Enter a second number: ");
        secondInput = myScanner.nextLine();
        System.out.println("Enter a third number: ");
        thirdInput = myScanner.nextLine();
        System.out.println("Enter a fourth number: ");
        fourthInput = myScanner.nextLine();
        System.out.println("Enter a fifth number: ");
        fifthInput = myScanner.nextLine();

        num1 = Float.parseFloat(firstInput);
        num2 = Float.parseFloat(secondInput);
        num3 = Float.parseFloat(thirdInput);
        num4 = Float.parseFloat(fourthInput);
        num5 = Float.parseFloat(fifthInput);

        float sum = num1 + num2 + num3 + num4 + num5;

        System.out.println("The sum of your five numbers is " + sum + ".");

    }
}
