/**
 * CalculateObject:
 * In this exercise, you will create an object that has a set of methods that does addition, subtraction, multiplication,
 * and division for two int parameters and a separate set of methods that does the same for two double parameters.
 * You will then instantiate the object and use it to perform the following calculations. You must print out the
 * calculation being performed and the result of the calculation. For example: 2 + 2 = 4
 * 1 + 1
 * 23 - 52
 * 34 * 2
 * 12 / 3
 * 12 / 7
 * 3.4 + 2.3
 * 6.7 * 4.4
 * 5.5 - 0.5
 * 10.8 / 2.2
 */

package com.company;

public class CalculateObject {
    public static void main(String[] args) {
        // Instantiate a calculator object
        Calculator result = new Calculator();

        // Perform operations on the object and print the calculations with the result
        System.out.println("1 + 1 = " + result.add(1, 1));
        System.out.println("23 - 52 = " + result.subtract(23, 52));
        System.out.println("34 * 2 = " + result.multiply(34, 2));
        System.out.println("12 / 3 = " + result.divide(12, 3));
        System.out.println("12 / 7 = " + result.divide(12, 7));
        System.out.println("3.4 + 2.3 = " + result.add(3.4, 2.3));
        System.out.println("6.7 * 4.4 = " + result.add(6.7, 4.4));
        System.out.println("5.5 - 0.5 = " + result.subtract(5.5,0.5));
        System.out.println("10.8 / 2.2 = " + result.divide(10.8, 2.2));
    }
}
