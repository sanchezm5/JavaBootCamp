/*
    Complete the following steps to create a List to hold information about your classmates.
    -Create a Classmate class, which has the properties name and hairColor.
    -Create a new List to hold Classmate objects.
    -Add at least 5 Classmate objects to the list.
    -Print out the name and hair color for every object in the list.
 */

package com.company;

public class Classmate {

    // Properties
    private String name;
    private String hairColor;

    // Constructor
    public Classmate(String name, String hairColor) {
        this.name = name;
        this.hairColor = hairColor;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
