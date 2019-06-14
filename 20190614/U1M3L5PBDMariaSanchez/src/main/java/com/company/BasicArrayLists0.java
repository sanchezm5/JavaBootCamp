/*
Basic ArrayLists 0:
    Create an ArrayList that can hold Integers. Add ten copies of the number -113 to the ArrayList.
    Then display the contents of the ArrayList on the screen.

    Do not use a loop. Also, do not use any variable for the index; you must use literal numbers to refer to each slot.


 */

package com.company;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayLists0 {
    public static void main(String[] args) {
        // Create an ArrayList to hold integers
        List<Integer> integerList = new ArrayList<>();

        // Add ten copies of -113
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);
        integerList.add(-113);

        // Then display the contents without using a loop or variable for the index
        System.out.println("Slot 0 contains a " + integerList.get(0));
        System.out.println("Slot 1 contains a " + integerList.get(1));
        System.out.println("Slot 2 contains a " + integerList.get(2));
        System.out.println("Slot 3 contains a " + integerList.get(3));
        System.out.println("Slot 4 contains a " + integerList.get(4));
        System.out.println("Slot 5 contains a " + integerList.get(5));
        System.out.println("Slot 6 contains a " + integerList.get(6));
        System.out.println("Slot 7 contains a " + integerList.get(7));
        System.out.println("Slot 8 contains a " + integerList.get(8));
        System.out.println("Slot 9 contains a " + integerList.get(9));

    }
}
