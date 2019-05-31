package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Would you like to input a word to display? (y/n)");
        String userInput = myScanner.nextLine();

        while(userInput.equals("y")) {
            System.out.println("Type in a word to display to the screen");
            String word = myScanner.nextLine();
            System.out.println(word);
            System.out.println("Would you like to type another word? (y/n)");
            userInput = myScanner.nextLine();
        }
    }
}
