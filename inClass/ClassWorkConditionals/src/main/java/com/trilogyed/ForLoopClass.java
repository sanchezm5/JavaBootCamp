package com.trilogyed;

import java.util.Scanner;

public class ForLoopClass {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What number would you like to count to?");
        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt((userInput));

        for(int i = 1; i <= userNum; i *= 2) {
            System.out.println(i);
        }
    }
}
