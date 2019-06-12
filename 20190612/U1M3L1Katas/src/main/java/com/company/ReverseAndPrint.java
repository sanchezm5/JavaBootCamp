/*
    Using the starter code provided, refactor the following array activities to use an ArrayList instead: ReverseAndPrint
 */


package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseAndPrint {

    public static void main(String[] args) {
        /* Original Code to be refactored:

        int [] numbers = {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43};

        System.out.println("--------------");
        System.out.println("Normal");
        System.out.println("--------------");

        for(int element : numbers) {
            System.out.println(element);
        }

        int[] reversed = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length-(i+1)];
        }

        System.out.println("--------------");
        System.out.println("Reversed");
        System.out.println("--------------");

        for(int element : reversed) {
            System.out.println(element);
        }

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

        // Display the original array first
        System.out.println("--------------");
        System.out.println("Normal");
        System.out.println("--------------");


        // Create an object which implements the Iterator interface
        Iterator<Integer> iter = integerList.iterator();

        // As long as there is a next element in the array list, display the elements in the array
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("--------------");
        System.out.println("Reversed");
        System.out.println("--------------");

        // Create a reversedList using the List interface and ArrayList class
        List<Integer> reversedList = new ArrayList<>();

        // Use a for loop to iterate through the integerList starting at the end of the array and work backwards
        for (int i = integerList.size() - 1; i >= 0; i--) {
            int currentElem = integerList.get(i);

            // Add each of the elements to the reversedList
            reversedList.add(currentElem);
        }

        // Call the iterator method on reversedList
        iter = reversedList.iterator();

        // Print out each element of the reversedList
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
