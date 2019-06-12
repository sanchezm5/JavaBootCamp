// In a new file for each, refactor the above activities to implement a LinkedList instead of an ArrayList.

package com.company;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseAndPrintLinkedList {
    public static void main(String[] args) {
        /* Original Code to be refactored:

        int [] numbers = {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43};

        System.out.println("----------------");
        System.out.println("Original Array");

        for(int element : numbers) {
            System.out.println(element);
        }

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        System.out.println("----------------");
        System.out.println("Swapped Array");

        for(int element : numbers) {
            System.out.println(element);
        }

         */

        // Create a list of integers using the List interface and the LinkedList class
        List<Integer> integerList = new LinkedList<>();

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
        System.out.println("----------------");
        System.out.println("Original Array");

        // Create an object which implements the Iterator interface
        Iterator<Integer> iter = integerList.iterator();

        // As long as there is a next element in the array list, display the elements in the array
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Next, display the swapped array
        System.out.println("----------------");
        System.out.println("Swapped Array");

        // Swap the elements at the first and last index of the original array
        Collections.swap(integerList, 0, integerList.size() - 1);

        // Call the iterator method on integerList
        iter = integerList.iterator();

        // Again, iterate through the integerList and print the swapped array elements
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
