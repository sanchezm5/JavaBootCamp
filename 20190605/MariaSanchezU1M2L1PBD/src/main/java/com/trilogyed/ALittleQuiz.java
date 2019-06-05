/*
A Little Quiz:
    Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something.
    It must keep track of how many they get wrong, and print out a "score" at the end.
*/

package com.trilogyed;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's take a quiz!");
        System.out.println("Select your answer choice by typing in the corresponding number.");

        // Prompt for Question 1
        System.out.println("\n");
        System.out.println("Q1) Which of these is NOT a primitive data type?");
        System.out.println("        1) int ");
        System.out.println("        2) boolean ");
        System.out.println("        3) String ");
        System.out.println("        4) float ");
        String answer1Input = scan.nextLine();
        int answer1 = Integer.parseInt(answer1Input);

        // Initialize number of correct answers to 0.
        // For each question, if the user enters the correct answer, increment the number correct by 1.
        int correctAnswers = 0;

        if (answer1 == 3) {
            correctAnswers++;
            System.out.println("That's right!");
        }
        else System.out.println("Sorry, the correct answer is \"String\".");

        // Prompt for Question 2
        System.out.println("\n");
        System.out.println("Q2) Can you store the value of \"puppy\" in a variable of type int?");
        System.out.println("        1) Yes ");
        System.out.println("        2) No ");
        String answer2Input = scan.nextLine();
        int answer2 = Integer.parseInt(answer2Input);

        if (answer2 == 2) {
            correctAnswers++;
            System.out.println("That's right!");
        }
        else System.out.println("Sorry, the correct answer is \"No\".");

        // Prompt for Question 3
        System.out.println("\n");
        System.out.println("Q3) Java is an Object-Oriented-Programming language.");
        System.out.println("        1) True ");
        System.out.println("        2) False ");
        String answer3Input = scan.nextLine();
        int answer3 = Integer.parseInt(answer3Input);

        if (answer3 == 1) {
            correctAnswers++;
            System.out.println("That's correct!");
        }
        else System.out.println("Sorry, the correct answer is \"True\".");

        // Finally, display the overall score
        System.out.println("\n");
        System.out.println("Overall, you got " + correctAnswers + " out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
}
