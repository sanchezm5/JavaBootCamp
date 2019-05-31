package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        int age;

        System.out.println("Enter your age: ");
        userInput = scanner.nextLine();
        age = Integer.parseInt(userInput);

        if (age < 14) {
            System.out.println("What grade are you in?");
            String grade = scanner.nextLine();
            System.out.println("Wow! " + grade + " grade - that sounds exciting!");
        } else if (age <= 18) {
            System.out.println("Are you planning to go to college? (Enter \"yes\" or \"no\")");
            String answer = scanner.nextLine();
            if (answer.equals("yes")) {
                System.out.println("What college?");
                String college = scanner.nextLine();
                System.out.println(college + " is a great school!");
            } else {
                System.out.println("What do you want to do after high school?");
                String afterHSAnswer = scanner.nextLine();
                System.out.println("Wow, " + afterHSAnswer + " sounds like a plan!");
            }
        } else {
            System.out.println("What is your job?");
            String jobAnswer = scanner.nextLine();
            System.out.println(jobAnswer + " sounds like a great job!");
        }
    }
}
