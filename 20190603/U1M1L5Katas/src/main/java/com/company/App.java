package com.company;

public class App {
    // Methods

    // Subtract Two
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Subtract or Zero
    public static int subtractOrZero(int a, int b) {
        int difference = a - b;

        if (difference < 0) {
            return 0;
        } else {
            return difference;
        }
    }

    // Max
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    // Min
    public static int min(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    // isLarger
    public static boolean isLarger(int first, int second) {
        if (first > second) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }

}
