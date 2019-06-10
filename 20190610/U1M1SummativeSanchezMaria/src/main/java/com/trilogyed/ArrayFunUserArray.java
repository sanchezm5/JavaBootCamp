/*
Array Fun (Arrays):
    This solution must be contained in a Java file called ArrayFunUserArray. Your code must read 5 ints from the user,
    put them in an array, and print the array elements to the screen.
 */
package com.trilogyed;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variable to represent each integer, a counter initialized to 0 and an array of length 5
        int num;
        int counter = 0;
        int[] arr = new int[5];

        System.out.println("You will enter 5 integers. Let's begin!" + "\n");

        do {
            // Prompt the user to enter 5 integers
            System.out.print("Enter an integer: ");

            // Read in the number and convert it to an integer
            String userInput = scan.nextLine();
            num = Integer.parseInt(userInput);

            // Put the value into an array
            arr[counter] = num;

            // Each time the user enters an integer, increment the counter by 1
            counter++;

        } while (counter < 5);

        // After the integers have been stored in the array, print them to the screen
        System.out.print("You have entered: ");
        for (int i = 0; i < arr.length; i++) {
            if ( i < 4) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
