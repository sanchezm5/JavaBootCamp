package com.company;

public class Memory {

    // Private Data Member(s)
    private int numOfGB;

    // Class Method(s)
    public int addMemory(int addMemInGB) {
        return numOfGB + addMemInGB;
    }

    // Class Getters and Setters
    public int getNumOfGB() {
        return numOfGB;
    }

    public void setNumOfGB(int numOfGB) {
        this.numOfGB = numOfGB;
    }
}
