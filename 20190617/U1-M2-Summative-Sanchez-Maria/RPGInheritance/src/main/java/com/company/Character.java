package com.company;

public class Character {

    // Properties
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    // Constructor
    public Character(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    public Character() {

    }

    // Character Methods
    public void run() {
        System.out.println(this.getName() + " is Running!!!");
    }

    public void attack() {
        System.out.println(this.getName() + " is Attacking!!!");
    }

    public void heal() {
        System.out.println(this.getName() + " is Healing!!!");
    }

    public void decreaseHealth(int health) {
        this.health = this.getHealth() - health;
        this.setHealth(this.health);
    }

    public void increaseStamina(int stamina) {
        this.stamina = this.getStamina() + stamina;
        this.setStamina(this.stamina);
    }

    public void decreaseStamina(int stamina) {
        this.stamina = this.getStamina() - stamina;
        this.setStamina(this.stamina);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

}
