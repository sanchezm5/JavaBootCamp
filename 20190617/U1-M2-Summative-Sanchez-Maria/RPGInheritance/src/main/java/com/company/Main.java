/**
 * In this exercise, you will design an inheritance hierarchy for characters in a video game. Your design must include
 * a common base clase for the following three character types: Farmer, Constable, and Warrior
 *
 * Farmer
 *  Properties: name, strength (initial value = 75), health (initial value = 100), stamina (initial value = 75),
 *              speed (initial value = 10), attackPower (initial value = 1)
 *  Abilities: run, plow, harvest, attack, heal, decreaseHealth, increaseStamina, decreaseStamina
 *
 * Constable
 *  Properties: name, strength (initial value = 60), health (initial value = 100), stamina (initial value = 60),
 *              speed (initial value = 20), attackPower (initial value = 5), jurisdiction
 *  Abilities: run, arrest, attack, heal, decreaseHealth, increaseStamina, decreaseStamina
 *
 * Warrior
 *  Properties: name, strength (initial value = 75), health (initial value = 100), stamina (initial value = 100),
 *              speed (initial value = 50), attackPower (initial value = 10), shieldStrength (initial value = 100)
 *  Abilities: run, attack, heal, decreaseHealth, increaseStamina, decreaseStamina, decreaseShieldStrength
 */

package com.company;

public class Main {
    public static void main(String[] args) {
        // Instantiate one of each character
        Farmer farmerChar = new Farmer("Old MacDonald", 75, 100, 75, 10, 1);
        Constable constableChar = new Constable("Sam", 60, 100, 60, 20, 5,"Region 1");
        Warrior warriorChar = new Warrior("Maria", 75, 100, 100, 50, 10, 100);

        // Examples for each to demonstrate inheritance from Character
        System.out.println("Farmer's name is : " + farmerChar.getName());
        farmerChar.run();
        farmerChar.heal();
        farmerChar.plow();
        farmerChar.attack();
        System.out.println("***********************************\n");

        System.out.println("Constable's name is : " + constableChar.getName());
        System.out.println("Constable's initial health is : " + constableChar.getHealth());
        constableChar.decreaseHealth(50);
        System.out.println("Constable's health after decreasing by 50 is : " + constableChar.getHealth());
        constableChar.arrest();
        System.out.println("***********************************\n");

        System.out.println("Warrior's name is : " + warriorChar.getName());
        System.out.println("Warrior's initial shieldStrength is : " + warriorChar.getHealth());
        warriorChar.decreaseShieldStrength(10);
        System.out.println("Warrior's shieldStrength after decreasing by 10 is: " + warriorChar.getShieldStrength());
        System.out.println("Warrior's initial stamina is: " + warriorChar.getStamina());
        warriorChar.increaseStamina(100);
        System.out.println("Warrior's stamina after increasing by 100 is: " + warriorChar.getStamina());
        System.out.println("***********************************\n");

    }
}
