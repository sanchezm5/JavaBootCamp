package com.company;

import com.company.interfaces.UserIO;

import java.util.Scanner;

// Implementing the interface
public class Input implements UserIO {
    Scanner scanner = new Scanner(System.in);

    String userInput;

    public int readInt(String prompt) {
        System.out.println(prompt);
        userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        userInput = scanner.nextLine();
        return Long.parseLong(userInput);

    }

    public double readDouble(String prompt){
        System.out.println(prompt);
        userInput = scanner.nextLine();
        return Double.parseDouble(userInput);
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        userInput = scanner.nextLine();
        return Float.parseFloat(userInput);
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        userInput = scanner.nextLine();
        return userInput;
    }
}
