/*
Array Fun (Arrays):
    This solution must be contained in a Java file called ArrayFun5Words. Your code must get 5 words from the user, put
    them in an array, and print the array elements to the screen.
 */

package com.trilogyed;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Declare variable to represent each word, a counter initialized to 0 and an array of length 5
        String wordInput;
        int counter = 0;
        String[] arr = new String[5];

        System.out.println("You will enter 5 words. Let's begin!" + "\n");

        do {
            // Prompt the user to enter 5 words
            System.out.print("Enter a word: ");

            // Read in the word
            wordInput = scan.nextLine();

            // Put the word into an array
            arr[counter] = wordInput;

            // Each time the user enters a word, increment the counter by 1
            counter++;

        } while (counter < 5);

        // After the words have been stored in the array, print them to the screen
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
