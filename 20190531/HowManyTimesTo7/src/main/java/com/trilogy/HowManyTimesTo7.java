package com.trilogy;

import java.util.Random;
import java.util.Scanner;

public class HowManyTimesTo7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        String userInput;
        int numOfRolls;

        int counterNumOf7s = 0;
        int counterFirst7 = 0;



        for(int i = 1; i <= 100; i++) {
            int dice1 = random.nextInt(5) + 1;
            int dice2 = random.nextInt(5) + 1;
            int sumOfDice = dice1 + dice2;

            if (sumOfDice == 7) {
                counterNumOf7s++;
                if (counterNumOf7s == 1) {
                    counterFirst7 = i;
                }
            }

        }
        System.out.println("The number of times a 7 is rolled is: " + counterNumOf7s);
        System.out.println("The first time a 7 is rolled is on iteration: " + counterFirst7);

        //Bonus
        System.out.println("How many times would you like to roll the dice? (Enter a number between 1 and 100)");
        userInput = scan.nextLine();
        numOfRolls = Integer.parseInt(userInput);

        int countNumOf2s = 0;
        int countFirst2 = 0;
        int countNumOf3s = 0;
        int countFirst3 = 0;
        int countNumOf4s = 0;
        int countFirst4 = 0;
        int countNumOf5s = 0;
        int countFirst5 = 0;
        int countNumOf6s = 0;
        int countFirst6 = 0;
        int countNumOf7s = 0;
        int countFirst7 = 0;
        int countNumOf8s = 0;
        int countFirst8 = 0;
        int countNumOf9s = 0;
        int countFirst9 = 0;
        int countNumOf10s = 0;
        int countFirst10 = 0;
        int countNumOf11s = 0;
        int countFirst11 = 0;
        int countNumOf12s = 0;
        int countFirst12 = 0;


        for (int i = 1; i <= numOfRolls; i++) {
            int dice1 = random.nextInt(5) + 1;
            int dice2 = random.nextInt(5) + 1;
            int sumOfDice = dice1 + dice2;

            switch(sumOfDice) {
                case 2:
                    countNumOf2s++;
                    if (countNumOf2s == 1) {
                        countFirst2 = i;
                    }
                    break;
                case 3:
                    countNumOf3s++;
                    if (countNumOf3s == 1) {
                        countFirst3 = i;
                    }
                    break;
                case 4:
                    countNumOf4s++;
                    if (countNumOf4s == 1) {
                        countFirst4 = i;
                    }
                    break;
                case 5:
                    countNumOf5s++;
                    if (countNumOf5s == 1) {
                        countFirst5 = i;
                    }
                    break;
                case 6:
                    countNumOf6s++;
                    if (countNumOf6s == 1) {
                        countFirst6 = i;
                    }
                    break;
                case 7:
                    countNumOf7s++;
                    if (countNumOf7s == 1) {
                        countFirst7 = i;
                    }
                    break;
                case 8:
                    countNumOf8s++;
                    if (countNumOf8s == 1) {
                        countFirst8 = i;
                    }
                    break;
                case 9:
                    countNumOf9s++;
                    if (countNumOf9s == 1) {
                        countFirst9 = i;
                    }
                    break;
                case 10:
                    countNumOf10s++;
                    if (countNumOf10s == 1) {
                        countFirst10 = i;
                    }
                    break;
                case 11:
                    countNumOf11s++;
                    if (countNumOf11s == 1) {
                        countFirst11 = i;
                    }
                    break;
                case 12:
                    countNumOf12s++;
                    if (countNumOf12s == 1) {
                        countFirst12 = i;
                    }
                    break;
                default:

            }
        }
        System.out.println("The number of times a 2 is rolled is: " + countNumOf2s);
        System.out.println("The first time a 2 is rolled is on this iteration: " + countFirst2);

        System.out.println("The number of times a 3 is rolled is: " + countNumOf3s);
        System.out.println("The first time a 3 is rolled is on this iteration: " + countFirst3);

        System.out.println("The number of times a 4 is rolled is: " + countNumOf4s);
        System.out.println("The first time a 4 is rolled is on this iteration: " + countFirst4);

        System.out.println("The number of times a 5 is rolled is: " + countNumOf5s);
        System.out.println("The first time a 5 is rolled is on this iteration: " + countFirst5);

        System.out.println("The number of times a 6 is rolled is: " + countNumOf6s);
        System.out.println("The first time a 6 is rolled is on this iteration: " + countFirst6);

        System.out.println("The number of times a 7 is rolled is: " + countNumOf7s);
        System.out.println("The first time a 7 is rolled is on this iteration: " + countFirst7);

        System.out.println("The number of times a 8 is rolled is: " + countNumOf8s);
        System.out.println("The first time a 8 is rolled is on this iteration: " + countFirst8);

        System.out.println("The number of times a 9 is rolled is: " + countNumOf9s);
        System.out.println("The first time a 9 is rolled is on this iteration: " + countFirst9);

        System.out.println("The number of times a 10 is rolled is: " + countNumOf10s);
        System.out.println("The first time a 10 is rolled is on this iteration: " + countFirst10);

        System.out.println("The number of times a 11 is rolled is: " + countNumOf11s);
        System.out.println("The first time a 11 is rolled is on this iteration: " + countFirst11);

        System.out.println("The number of times a 12 is rolled is: " + countNumOf12s);
        System.out.println("The first time a 12 is rolled is on this iteration: " + countFirst12);

    }
}
