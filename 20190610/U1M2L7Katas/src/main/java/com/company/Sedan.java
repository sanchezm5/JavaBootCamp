/*
    Create a Sedan class. It should extend Car and have the following properties and associated getters/setters:
            -int numDoors
            -boolean poweredWindows
 */
package com.company;

// Sedan inherits from Car
public class Sedan extends Car {

    // Private Data Members
    private int numDoors;
    private boolean poweredWindows;

    // Sedan Getters and Setters
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isPoweredWindows() {
        return poweredWindows;
    }

    public void setPoweredWindows(boolean poweredWindows) {
        this.poweredWindows = poweredWindows;
    }
}
