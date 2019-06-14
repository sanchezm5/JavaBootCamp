/*
Copying ArrayLists:
    Write a program that creates an ArrayList of Integers. It should put ten random numbers from 1 to 100 in the ArrayList.
    It should copy all the elements of that ArrayList into another ArrayList of the same size. Then display the contents
    of both ArrayLists in any way you like.

    Create an ArrayList of Integers
Fill the ArrayList with ten random numbers (1-100)
Copy each value from the ArrayList into another ArrayList of the same capacity
Change the last value in the first ArrayList to a -7
Display the contents of both ArrayLists
ArrayList 1: [45, 87, 39, 32, 93, 86, 12, 44, 75, -7]
ArrayList 2: [45, 87, 39, 32, 93, 86, 12, 44, 75, 50]
 */

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CopyingArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList to hold ten Integers
        List<Integer> intList1 = new ArrayList<>();

        // Declare a random variable
        Random random = new Random();

        // Add 10 random integers (1 to 100) into the arrayList
        for (int i = 0; i < 10; i++) {
            intList1.add(random.nextInt(100) + 1);
        }

        // Create another ArrayList and set it contents equal to a copy of the first ArrayList
        List<Integer> intList2 = new ArrayList<>(intList1);

        // Change the last value in the first ArrayList to a -7
        intList1.set(9, -7);

        // Display the contents of both ArrayLists
        System.out.println("Array List 1: " + intList1);
        System.out.println("Array List 2: " + intList2);
    }
}
