/*
Basic ArrayLists 3:
    Create an ArrayList of Integers. Fill up the list with 1,000 random numbers, each from 10 to 99. Then display the
    contents of the ArrayList on the screen in any way you like.
 */

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLists3 {
    public static void main(String[] args) {
        // Create an ArrayList to hold ten Integers
        List<Integer> integerList = new ArrayList<>();

        // Declare a random variable
        Random random = new Random();

        // Add 100 random integers (10 to 99) into the arrayList
        for (int i = 0; i <1000; i++) {
            integerList.add(random.nextInt(90) + 10);
        }
        // Print the contents of the arrayList to the console
        System.out.println("ArrayList: " + integerList);
    }
}
