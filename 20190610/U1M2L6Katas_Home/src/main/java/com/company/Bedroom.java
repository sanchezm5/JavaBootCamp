package com.company;

public class Bedroom {

    // Private Data Member(s)
    private float sqFtInBedroom;
    private String floorTypeBedRm;

    // Class Method(s)
    public String changeBedRmFloorType(String newFloorType) {
        return newFloorType;
    }

    // Class Getters and Setters
    public float getSqFtInBedroom() {
        return sqFtInBedroom;
    }

    public void setSqFtInBedroom(float sqFtInBedroom) {
        this.sqFtInBedroom = sqFtInBedroom;
    }

    public String getFloorTypeBedRm() {
        return floorTypeBedRm;
    }

    public void setFloorTypeBedRm(String floorTypeBedRm) {
        this.floorTypeBedRm = floorTypeBedRm;
    }
}
