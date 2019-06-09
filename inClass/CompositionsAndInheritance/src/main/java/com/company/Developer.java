package com.company;

public class Developer extends StaffMember{

    private String name;

    // Constructor
    public Developer() {
        System.out.println("Developer constructor");
    }

    public Developer() {
        this.name = name;
        System.out.println("Developer constructor: name = " + this.name);
    }

    protected void givesEstimate(int num, String msg) {
        System.out.println("by Developer");
    }

    public void generateCode() {

    }

    public void checkInCode() {

    }

    public String getName() {
        return this.name;
    }

    public void submitTimeCard() {
        System.out.println("Time card submission");
    }
}
