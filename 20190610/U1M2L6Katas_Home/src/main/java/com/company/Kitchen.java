package com.company;

public class Kitchen {

    // Private Data Member(s)
    private String floorTypeKitchen;
    private float sqFtInKitchen;
    private String stoveType;

    // Class Method(s)
    public String changeKitchenFloorType(String newFloorType) {
        return newFloorType;
    }

    public String changeStoveType(String newStoveType) {
        return newStoveType;
    }

    // Class Getters and Setters
    public String getFloorTypeKitchen() {
        return floorTypeKitchen;
    }

    public void setFloorTypeKitchen(String floorTypeKitchen) {
        this.floorTypeKitchen = floorTypeKitchen;
    }

    public float getSqFtInKitchen() {
        return sqFtInKitchen;
    }

    public void setSqFtInKitchen(float sqFtInKitchen) {
        this.sqFtInKitchen = sqFtInKitchen;
    }

    public String getStoveType() {
        return stoveType;
    }

    public void setStoveType(String stoveType) {
        this.stoveType = stoveType;
    }

}
