/*
Some Math (Methods):
    In this program, you will create three methods and call them from main with the specified parameters.
        1. Create a method called total5. This method must take 5 int parameters and return the total. You must call the
           method with the following parameters and print the returned total to the screen: 1, 2, 3, 4, 5.

        2. Create a method called average5. This method must take 5 int parameters and return the average of the numbers
           as a double. You must call the method with the following parameters and print the returned average to the
           screen: 1, 3, 5, 7, 9.

        3. Create a method called largest5. This method must take 5 double parameters and return the largest. You must
           call the method with the following parameters and print the returned value to the screen:
           42.0, 35.1, 2.3, 40.2, 15.6.
 */

package com.trilogyed;

public class SomeMath {
    public static void main(String[] args) {

        // total5 Method Call with these parameters and total printed
        System.out.println("The sum of 1, 2, 3, 4, and 5 is " + total5(1, 2, 3, 4, 5) + "." + "\n");

        // average5 Method Call with these parameters and average printed
        System.out.println("The average of 1, 3, 5, 7, and 9 is " + average5(1, 3, 5, 7, 9) + "." + "\n");

        // largest5 Method Call with these parameters and largest printed
        System.out.println("The largest of 42.0, 35.1, 2.3, 40.2, 15.6 is " + largest5(42.0, 35.1, 2.3, 40.2, 15.6) + "." + "\n");
    }

    // total5 Method: takes in 5 integer parameters and returns its sum
    public static int total5(int num1, int num2, int num3, int num4, int num5) {
        int sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }

    // average5 Method: takes in 5 integer parameters and returns the average as a double data type
    public static double average5(int num1, int num2, int num3, int num4, int num5) {

        // Find the total of the 5 integers
        int total = total5(num1, num2, num3, num4, num5);

        // Convert that total into a double data type
        double sum = new Double(total);

        // Create average formula
        double average = sum / 5;

        // Return the average
        return average;
    }

    // largest5 takes 5 double parameters and returns the largest
    public static double largest5(double num1, double num2, double num3, double num4, double num5) {

        // Use an array to hold the 5 double parameters
        double[] arr = {num1, num2, num3, num4, num5};

        // Initialize the largest = 0 and declare a variable to represent the current number element in the array
        double largest = 0;
        double currentNum;

        // Iterate through each element in the array and compare the value of the current number to the largest
        for (int i = 0; i < arr.length; i++) {
            currentNum = arr[i];
            if (currentNum > largest) {
                largest = currentNum;
            }
        }
        // Return the largest value
        return largest;
    }

}
