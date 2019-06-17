package com.company;

// Constable inherits from Character
public class Constable extends Character {

    // Properties
    private String jurisdiction;

    // Constructor
    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower);
        this.jurisdiction = jurisdiction;
    }

    public Constable(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    // Constable Methods
    public void arrest() {
        System.out.println("Constable " + this.getName() +  " is Arresting!!!");
    }

    // Getters and Setters
    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
}