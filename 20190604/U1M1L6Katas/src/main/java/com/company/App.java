package com.company;

public class App {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 3};
        String[] strArr = {"ant", "bat", "cat"};

//        System.out.println(total(arr));
//        System.out.println(totalOdd(arr));
//        System.out.println(totalEven(arr));
//        System.out.println(secondLargestNumber(arr));
//        System.out.println(reverse(arr));
//        System.out.println(everyThird(arr));
//        System.out.println(lessThanFive(arr));
//        System.out.println(splitAtFive(arr));
//        System.out.println(swapFirstAndLast(strArr));
//        System.out.println(concatenateString(strArr));
//        System.out.println(evensAndOdds(strArr));
    }

    // Total
    public static int total(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    // Total Odd
    public static int totalOdd(int[] arr) {
        int sumOfOddIndexes = 0;

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 1) {
                sumOfOddIndexes += arr[i];
            }
        }
        return sumOfOddIndexes;
    }

    // Total Even
    public static int totalEven(int[] arr) {
        int sumOfEvenIndexes = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sumOfEvenIndexes += arr[i];
            }
        }
        return sumOfEvenIndexes;
    }

    // 2nd Largest Number
    public static int secondLargestNumber(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[1];

        for (int element : arr) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if (element > secondLargest && element != largest) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }

    // Swap First and Last
    public static String[] swapFirstAndLast(String[] strArr) {
        String[] newStrArr = strArr;
        String first = strArr[0];
        String last = strArr[strArr.length - 1];

        for (int i = 0; i < strArr.length; i++) {
            if (i == 0) {
                newStrArr[newStrArr.length - 1] = first;
            } else if (i == strArr.length - 1) {
                newStrArr[0] = last;
            } else {
                newStrArr[i] = strArr[i];
            }
        }
        return newStrArr;
    }

    // Reverse
    public static int[] reverse(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[arr.length - i - 1] = arr[i];
        }
        return reversedArray;
    }

    // Concatenate String
    public static String concatenateString(String[] strArr) {
        String newString = "";

        for (String element : strArr) {
            newString += element;
        }
        return newString;
    }

    // Every 3rd
    public static int[] everyThird(int[] arr) {
        int newArrSize = arr.length / 3;
        int[] newArr = new int[newArrSize];

        if (arr.length < 3) return null;

        for (int i = 2; i < arr.length; i += 3) {
            newArr[i / 3] = arr[i];
        }
        return newArr;
    }

    // Less Than 5
    public static int[] lessThanFive(int[] arr) {
        int newArrSizeCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                newArrSizeCounter++;
            }
        }
        if (newArrSizeCounter == 0) return null;

        int[] newArr = new int[newArrSizeCounter];
        int newArrIndex = 0;

        for (int element : arr) {
            if (element < 5) {
                newArr[newArrIndex] = element;
                newArrIndex++;
            }
        }
        return newArr;
    }

    // Split at 5
    public static int[][] splitAtFive(int[] arr) {
        int arr1Size = 0;
        int arr2Size = 0;

        for (int element: arr) {
            if (element < 5) {
                arr1Size++;
            } else {
                arr2Size++;
            }
        }

        int[] lessThan5Arr = new int[arr1Size];
        int[] greaterThanOrEqualTo5Arr = new int[arr2Size];
        int arr1Index = 0;
        int arr2Index = 0;
        int[][] finalArr = {lessThan5Arr, greaterThanOrEqualTo5Arr};

        for (int element: arr) {
            if (element < 5) {
                lessThan5Arr[arr1Index] = element;
                arr1Index++;
            } else {
                greaterThanOrEqualTo5Arr[arr2Index] = element;
                arr2Index++;
            }
        }
        return finalArr;
    }

    // Evens and Odds
    public static String[][] evensAndOdds(String[] arr) {
        int evenArrSize = 0;
        int oddArrSize = 0;

        if (arr.length % 2 == 0) {
            evenArrSize = arr.length / 2;
            oddArrSize = arr.length / 2;
        }
        if (arr.length % 2 == 1) {
            evenArrSize = (arr.length /2) + 1;
            oddArrSize = arr.length / 2;
        }

        String[] evenArr = new String[evenArrSize];
        String[] oddArr = new String[oddArrSize];
        int evenIndex = 0;
        int oddIndex = 0;
        String [][] finalArray = {evenArr, oddArr};

        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                evenArr[evenIndex] = arr[i];
                evenIndex++;
            } else {
                oddArr[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        return finalArray;
    }

}
