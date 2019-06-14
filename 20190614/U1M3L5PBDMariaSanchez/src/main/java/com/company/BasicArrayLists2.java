/*
Basic ArrayLists 2:
    Create an ArrayList of Integers. Fill up the list with ten random numbers, each from 1 to 100. Then display the
    contents of the ArrayList on the screen. You must use a loop to fill up the list. However, you may display it
    the easy way (no loop needed) like so:

        System.out.println( "ArrayList: " + whateverYourArrayListVariableIsCalled );
 */

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        // Create an ArrayList to hold ten Integers
        List<Integer> integerList = new ArrayList<>();

        // Declare a random variable
        Random random = new Random();

        // Add ten random integers (1 to 100) into the arrayList
        for (int i = 0; i <100; i++) {
            integerList.add(random.nextInt(100) + 1);
        }
        // Print the contents of the arrayList to the console
        System.out.println("ArrayList: " + integerList);
    }
}