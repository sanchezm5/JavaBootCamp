package com.company;

public class Basement {

    // Private Data Member(s)
    private boolean isFinished;
    private float sqFtInBasement;

    // Class Method(s)
    public boolean changeToFinished() {
        return false;
    }

    // Class Getters and Setters
    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public float getSqFtInBasement() {
        return sqFtInBasement;
    }

    public void setSqFtInBasement(float sqFtInBasement) {
        this.sqFtInBasement = sqFtInBasement;
    }
}
