package com.company;

// Farmer inherits from Character
public class Farmer extends Character {

    // Constructor
    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);

    }

    public Farmer() {

    }

    // Farmer Methods
    public void plow() {
        System.out.println("Farmer " + this.getName() + " is plowing!!!");
    }

    public void harvest() {
        System.out.println("Farmer is harvesting!!!");
    }
}
