package com.company;

public abstract class StaffMember {

    // Private Data Members
    private String name;
    private String department;

    // abstract method
    public abstract void submitTimeCard();

    // Constuctor
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
