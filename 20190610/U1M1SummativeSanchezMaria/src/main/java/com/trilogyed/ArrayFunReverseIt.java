/*
Array Fun (Arrays):
    This solution must be contained in a Java file called ArrayFunReverseIt. Your code must declare the following array
    [1, 2, 3, 4, 5], create another array of equal length, and fill that array with values from the original array but
    in reverse order. Finally, your code must print the contents of both arrays to the screen.
 */

package com.trilogyed;

public class ArrayFunReverseIt {
    public static void main(String[] args) {

        // Declare an array with the given elements and create another array with length 5
        int[] originalArr = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[5];
        int index = 0;

        // Iterate through the original array starting with the last element
        for (int i = originalArr.length - 1; i >= 0; i--) {

            // Work backwards for each element in the original array and store that element in the reversed array
            int currentElement = originalArr[i];
            reversedArr[index] = currentElement;

            // Each time an element is stored in the reversed array, increment the index counter by 1
            index++;
        }

        // Finally, print the contents of both arrays to the screen
        System.out.println("The original array contains: [" + originalArr[0] + ", " + originalArr[1] + ", " + originalArr[2] + ", " + originalArr[3] + ", " + originalArr[4] + "]. \n");
        System.out.println("The original array contains: [" + reversedArr[0] + ", " + reversedArr[1] + ", " + reversedArr[2] + ", " + reversedArr[3] + ", " + reversedArr[4] + "]. \n");
    }
}
