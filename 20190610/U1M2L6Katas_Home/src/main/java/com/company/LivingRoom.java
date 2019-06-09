package com.company;

public class LivingRoom {

    // Private Data Member(s)
    private float sqFtInLivingRoom;
    private String floorTypeLivingRm;

    // Class Method(s)
    public String changeLivingRmFloorType(String newFloorType) {
        return newFloorType;
    }

    // Class Getters and Setters
    public float getSqFtInLivingRoom() {
        return sqFtInLivingRoom;
    }

    public void setSqFtInLivingRoom(float sqFtInLivingRoom) {
        this.sqFtInLivingRoom = sqFtInLivingRoom;
    }

    public String getFloorTypeLivingRm() {
        return floorTypeLivingRm;
    }

    public void setFloorTypeLivingRm(String floorTypeLivingRm) {
        this.floorTypeLivingRm = floorTypeLivingRm;
    }

}
