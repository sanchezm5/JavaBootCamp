package com.company;

import java.util.List;
import java.util.ArrayList;

public class CollectionsMain {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<String>();

        // check size of myList
        System.out.println("Size of myList = " + myList.size());

        // add elements
        myList.add("Usman");
        myList.add("Sal");
        myList.add("Ofe");
        myList.add("Sal");
        myList.add("Sal");

        System.out.println("Size of myList after adding elements = " + myList.size());

        // Here we must use the Integer class bc we cannot use primitive types with ArrayLists
        List<Integer> myList2 = new ArrayList<Integer>();

        // To get a specific element
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));

        // Here you can print the array
        System.out.println(myList);

        // 3 Ways to Print elements of array
        System.out.println("\nEnhanced for loop:");
        for (String element : myList) {
            System.out.println(element);
        }

        System.out.println("\nFor loop");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // when there is more that one element that has the same value, index returned will be the first instance
        int index = myList.indexOf("Sal");
        System.out.println("Sal is at index = " + index + " - " + myList.get(index));
    }
}
