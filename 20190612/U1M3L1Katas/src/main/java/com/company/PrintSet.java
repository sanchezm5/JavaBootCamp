/*
    In a file called PrintSet, implement a HashSet and add these values to it: 5,1,2,1,4,1,5.
    Use an Iterator to print all members of the HashSet.
 */

package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class PrintSet {
    public static void main(String[] args) {
        // Create a Hash Set
        HashSet<Integer> num = new HashSet<>();

        // Add elements to the HashSet
        num.add(5);
        num.add(1);
        num.add(2);
        num.add(1);
        num.add(4);
        num.add(1);
        num.add(5);

        // Iterate over hash set items
        Iterator<Integer> iter = num.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // Because Hash Set is a set, it cannot have duplicates
        // Print out each member of the hash set
        System.out.println(num);
    }
}
