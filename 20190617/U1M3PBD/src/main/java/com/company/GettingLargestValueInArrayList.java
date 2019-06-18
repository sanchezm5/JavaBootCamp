/**
 * Getting the Largest Value in an ArrayList:
 * Write a program that creates an ArrayList which can hold Integers. Fill the ArrayList with random numbers from
 * 1 to 100. Display the values in the ArrayList on the screen. Then use a linear search to find the largest value
 * in the ArrayList, and display that value.
 *
 *  Sample Output:
 * ArrayList: [45, 87, 39, 32, 93, 86, 12, 44, 75, 50]
 * The largest value is 93
 */
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GettingLargestValueInArrayList {
    public static void main(String[] args) {
        // Create an arrayList to hold integers
        List<Integer> integerList = new ArrayList<>();

        // Fill the arrayList with random numbers from 1 to 100
        Random random = new Random();
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);
        integerList.add(random.nextInt(100) + 1);

        // Print the arrayList
        System.out.println("ArrayList: " + integerList);

        // Find the largest value and display that value
        int max = Collections.max(integerList);
        System.out.println("The largest value is " + max);
    }
}
