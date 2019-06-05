package com.trilogyed;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] newArr = new int[4];

        newArr[0] = 122;
        newArr[1] = 243;
        newArr[2] = 345;
        newArr[3] = 400;

        for (int element : newArr) {
            System.out.println(element);
        }

        System.out.println(arr[0]);

        arr[1] = 6;

        System.out.println("2nd element " + arr[1]);
        //This does not work like you think it would: System.out.println("array = " + arr);
        // because arrays are classes/object this will only print the address of the array stored in memory

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("******************Enhanced For Loop***************************************");
        for (int element : arr) {
            //System.out.println(element);
            element = 7; // by assigning 7 to element, all elements in the array will be changed
            System.out.println(element);
            System.out.println("elem=" + element);
        }

        for (int element : arr) {
            System.out.println(element);
        }
    }
}
