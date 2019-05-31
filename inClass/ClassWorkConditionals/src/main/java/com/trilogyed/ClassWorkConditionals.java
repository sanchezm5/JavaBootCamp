package com.trilogyed;

import java.util.Scanner;

public class ClassWorkConditionals {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7: ");
        //inputDay = myScanner.nextLine();
        String day = Integer.toString(myScanner.nextInt());

        switch (day) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }

// ***********************************2nd exercise ********************************
//        if (day == 1) {
//            System.out.println("You chose Monday");
//        }else if(day == 2){
//            System.out.println("You chose Tuesday");
//        }else if(day == 3){
//            System.out.println("You chose Wednesday");
//        }else if(day == 4){
//            System.out.println("You chose Thursday");
//        }else if(day == 5){
//            System.out.println("You chose Friday");
//        }else if(day == 6){
//            System.out.println("You chose Saturday");
//        }else if(day == 7){
//            System.out.println("You chose Sunday");
//        }else{
//            System.out.println("you entered an invalid number.");
//        }


// **********************************1st exercise with conditional (if/else-if/else)
//        int age = 19;

//        if (age >= 35) {
//            System.out.println("Since you are " + age + " years old, you are eligible to vote and run for president.");
//        } else if (age >= 18) {
//            System.out.println("Since you are " + age + " years old, you are eligible to vote.");
//        } else {
//            System.out.println("You are not old enough to vote.");
//        }
    }
}
