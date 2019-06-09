package com.company;

public class Bathroom {

    // Private Data Member(s)
    private float sqFtInBathroom;
    private String bathroomType;


    // Class Method(s)
    public String changeBathType(String newBathroomType) {
        return newBathroomType;
    }

    // Class Getters and Setters
    public float getSqFtInBathroom() {
        return sqFtInBathroom;
    }

    public void setSqFtInBathroom(float sqFtInBathroom) {
        this.sqFtInBathroom = sqFtInBathroom;
    }

    public String getBathroomType() {
        return bathroomType;
    }

    public void setBathroomType(String bathroomType) {
        this.bathroomType = bathroomType;
    }

}
