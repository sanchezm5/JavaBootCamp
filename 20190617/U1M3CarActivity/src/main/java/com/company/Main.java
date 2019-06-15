package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user with a welcome message
        System.out.println("Select an option from the menu below: ");
        System.out.println("(1) Add car");
        System.out.println("(2) Delete car");
        System.out.println("(3) Show Inventory");
        System.out.println("(4) Search");
        System.out.println("(5) Exit");

        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                CarInventory carInv = new CarInventory();
                carInv.add();

            default:
                System.out.println("!!!!!");
        }
    }
}
