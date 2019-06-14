/*
ArrayList - There or Not?:
    Create an ArrayList of Integers, and fill each slot with a different random value from 1-50. Display those values on
    the screen, and then prompt the user for an integer. Search through the ArrayList, and if the item is present, say so.
    If the value is not in the ArrayList, display a single message saying so. Just like the previous assignment, if the
    value is present more than once, you may display the message as many times as necessary.
 */

package com.company;

import java.util.*;

public class ArrayListThereOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Create an ArrayList to hold integers
        List<Integer> integerList = new ArrayList<>();

        // Declare a random variable
        Random random = new Random();

        // Add 10 random integers (1 to 50) into the arrayList
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(50) + 1);
        }
        // Print the contents of the arrayList to the console
        System.out.println("ArrayList: " + integerList);

        // Prompt the user for an integer
        System.out.print("Value to find: ");
        String userInput = scan.nextLine();
        int number = Integer.parseInt(userInput);

        // Create an object which implements the Iterator interface
        Iterator<Integer> iter = integerList.iterator();

        // As long as there is a next element in the array list ...
        while(iter.hasNext()) {
            // ... search through the ArrayList, and if the item is present, say so with a message
            // Note: If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once
            if (iter.next().equals(number)) {
                System.out.println(number + " is in the ArrayList");
            }
        }
        // If the value is not in the ArrayList, display a single message saying so
        if (!integerList.contains(number)) {
            System.out.println(number + " is not in the ArrayList");
        }
    }
}
