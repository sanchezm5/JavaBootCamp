package com.company;

import com.company.interfaces.UserIO;

import java.util.Scanner;

public class BetterInput implements UserIO {
    Scanner scanner = new Scanner(System.in);

    String userInput;

    public int readInt(String prompt) {
        try {
            System.out.println(prompt);
            userInput = scanner.nextLine();
            return Integer.parseInt(userInput);
        } catch (Exception e) {
            System.out.println("Something went wrong. Please try again.");
        }   return readInt(prompt);
    }

    public long readLong(String prompt) {
        try {
            System.out.println(prompt);
            userInput = scanner.nextLine();
            return Long.parseLong(userInput);
        } catch (Exception e) {
            System.out.println("Something went wrong. Please try again.");
        }   return readLong(prompt);
    }

    public double readDouble(String prompt) {
        try {
            System.out.println(prompt);
            userInput = scanner.nextLine();
            return Double.parseDouble(userInput);
        } catch (Exception e) {
            System.out.println("Something went wrong. Please try again.");
        }   return readDouble(prompt);
    }

    public float readFloat(String prompt) {
        try {
            System.out.println(prompt);
            userInput = scanner.nextLine();
            return Float.parseFloat(userInput);
        } catch (Exception e) {
            System.out.println("Something went wrong. Please try again.");
        }   return readFloat(prompt);
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        userInput = scanner.nextLine();
        return userInput;
    }
}
