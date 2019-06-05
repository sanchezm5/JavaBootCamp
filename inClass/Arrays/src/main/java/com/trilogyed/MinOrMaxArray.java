package com.trilogyed;

import java.util.Scanner;

public class MinOrMaxArray {
    public static void main(String[] args) {

//        int[] arr = getArrayInput();
//        System.out.println("MIN number => " + getMinNumber(arr));
//        System.out.println("MAX number => " + getMaxNumber(arr));
//        System.out.println("SUM of array => " + getSum(arr));

        String[][] newArr = {
                {"a", "c", "d"},
                {"e", "f", "g"},
                {"h", "i", "j"}
        };


        for (String[] element: newArr) {
            System.out.println(" ");
            for (String el : element) {
                System.out.print(el + " ");
            }
        }

        //another solution
        for (String[] element: newArr) {
            String line = "";
            for(String el : element) {
                line = line + el + " ";

            }
            System.out.println(line);
        }
    }

    public static int getMaxNumber(int[] arr) {
        int maxNumber = arr[0];
        for (int element: arr) {
            if(element > maxNumber) {
                maxNumber = element;
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(int[] arr) {
        int minNumber = arr[0];
        for (int element: arr) {
            if (element < minNumber) {
                minNumber = element;
            }
        }
        return minNumber;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        return sum;
    }

    public static int[] getArrayInput() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number of inputs: ");
        int arraySize = Integer.parseInt(myScanner.nextLine());

        int[] arrayInput = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter your number: (" + (i+1) + ")");
            arrayInput[i] = Integer.parseInt(myScanner.nextLine());
        }
        return arrayInput;
    }
}
