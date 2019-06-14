/*
Basic ArrayLists 1:
    Create an ArrayList that can hold Integers. Add ten copies of the number -113 to the ArrayList.
    Then display the contents of the ArrayList on the screen.

    This time, you must use a loop, both to fill up the ArrayList and to display it. Also, in the condition of your loop,
    you should not count up to a literal number. Instead you should use the size() of your ArrayList.
 */

package com.company;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayLists1 {
    public static void main(String[] args) {

        // Create an ArrayList to hold ten Integers
        List<Integer> integerList = new ArrayList<>();

        // Add the same integer into the arrayList until the size does not equal 10
        do {
            integerList.add(-113);
        } while (integerList.size() != 10);

        // Print the contents of the arrayList to the console
        for (int i = 0; i <integerList.size(); i++) {
            System.out.println("Slot " + i + " contains a " + integerList.get(i));
        }
    }
}
