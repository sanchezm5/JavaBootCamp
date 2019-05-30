package com.trilogyed;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String first, last, email, twitterHandle, age, country, profession, opSys, progLang, compSci, shortcutKeys, compBuild, superHero;

        System.out.println("Please enter the following information: ");
        System.out.println("First name: ");
        first = myScanner.nextLine();
        System.out.println("Last name: ");
        last = myScanner.nextLine();
        System.out.println("Email: ");
        email = myScanner.nextLine();
        System.out.println("Twitter handle: ");
        twitterHandle = myScanner.nextLine();
        System.out.println("Age: ");
        age = myScanner.nextLine();
        System.out.println("Country: ");
        country = myScanner.nextLine();
        System.out.println("Profession: ");
        profession = myScanner.nextLine();
        System.out.println("Favorite operating system: ");
        opSys = myScanner.nextLine();
        System.out.println("Favorite programming language: ");
        progLang = myScanner.nextLine();
        System.out.println("Favorite computer scientist: ");
        compSci = myScanner.nextLine();
        System.out.println("Favorite keyboard shortcut: ");
        shortcutKeys = myScanner.nextLine();
        System.out.println("Have you ever built your own computer? ");
        compBuild = myScanner.nextLine();
        System.out.println("If you could be any superhero who would it be? ");
        superHero = myScanner.nextLine();

        System.out.println("Please verify that the information you have entered is correct.");
        System.out.println("First name: " + first);
        System.out.println("Last name: " + last);
        System.out.println("Email: " + email);
        System.out.println("Twitter handle: " + twitterHandle);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("Profession: " + profession);
        System.out.println("Favorite operating system: " + opSys);
        System.out.println("Favorite programming language: " + progLang);
        System.out.println("Favorite computer scientist: " + compSci);
        System.out.println("Favorite keyboard shortcut: " + shortcutKeys);
        System.out.println("Have you ever built your own computer? " + compBuild);
        System.out.println("If you could be any superhero who would it be? " + superHero);

    }
}
