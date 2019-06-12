/*
    Using the starter code provided, refactor the following array activities to use an ArrayList instead: Total
 */

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Total {

    public static void main(String[] args) {
        /* Original Code to be refactored:

        int [] numbers = {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43};

        int total = 0;

        for(int element : numbers) {
          total += element;
        }

        System.out.println("The sum of all elements in the array is " + total);

         */

        // Create a list of integers using the List interface and the ArrayList class
        List<Integer> integerList = new ArrayList<>();

        // Add these integers to the array list to produce the original given array
        integerList.add(2);
        integerList.add(4);
        integerList.add(5);
        integerList.add(3);
        integerList.add(7);
        integerList.add(6);
        integerList.add(1);
        integerList.add(9);
        integerList.add(10);
        integerList.add(13);
        integerList.add(56);
        integerList.add(43);

        // This will display the array
        System.out.println("This is the integerList array = " + integerList + "\n");

        // Create an object which implements the Iterator interface
        Iterator<Integer> iter = integerList.iterator();

        // Initialize the sum = 0
        int sum = 0;

        // As long as there is a next element in the array list, add that element to the sum
        while(iter.hasNext()) {
            sum += iter.next();
        }


        // Display the sum of the elements
        System.out.println("The sum of all elements in the array is " + sum);
    }
}
