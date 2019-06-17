package com.company;

// Warrior inherits from Character
public class Warrior extends Character {

    // Properties
    private int shieldStrength;

    // Constructor
    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower);
        this.shieldStrength = shieldStrength;
    }

    public Warrior(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    // Warrior Methods
    public void decreaseShieldStrength(int shieldStrength) {
        this.shieldStrength = this.getShieldStrength() - shieldStrength;
        this.setShieldStrength(this.shieldStrength);
    }

    // Getters and Setters
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
