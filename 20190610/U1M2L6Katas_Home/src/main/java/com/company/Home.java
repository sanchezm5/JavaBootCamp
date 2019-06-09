/*
Home:
    Create a class representing a home. It should be comprised of the below objects. Each object should have state and
    behavior appropriate to them (square footage, length, width, flooring type, etc).

    Start by first creating a UML diagram. Then, using that as your guide, write the code for the class.
        -Basement
        -Bathroom
        -Kitchen
        -Patio
        -Etc.
*/

package com.company;

public class Home {

    // Private Data Member(s)
    private String homeType;
    private float pricePerSqFt;
    private float squareFootage;
    private int numberOfRooms;
    private String color;

    // Other Class Data Member(s)
    private Bathroom sqFtInBathroom;
    private Bathroom bathroomType;

    private Kitchen floorTypeKitchen;
    private Kitchen sqFtInKitchen;
    private Kitchen stoveType;

    private LivingRoom sqFtInLivingRoom;
    private LivingRoom floorTypeLivingRm;

    private Basement isFinished;
    private Basement sqFtInBasement;

    private Bedroom sqFtInBedroom;
    private Bedroom floorTypeBedRm;

    // Class Method(s)
    public float price(float pricePerSquareFt, float squareFootage) {
        return pricePerSquareFt * squareFootage;
    }

    // Class Getters and Setters
    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType;
    }

    public float getPricePerSqFt() {
        return pricePerSqFt;
    }

    public void setPricePerSqFt(float pricePerSqFt) {
        this.pricePerSqFt = pricePerSqFt;
    }

    public float getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(float squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Other Class Getters and Setters
    public Bathroom getSqFtInBathroom() {
        return sqFtInBathroom;
    }

    public void setSqFtInBathroom(Bathroom sqFtInBathroom) {
        this.sqFtInBathroom = sqFtInBathroom;
    }

    public Bathroom getBathroomType() {
        return bathroomType;
    }

    public void setBathroomType(Bathroom bathroomType) {
        this.bathroomType = bathroomType;
    }

    public Kitchen getFloorTypeKitchen() {
        return floorTypeKitchen;
    }

    public void setFloorTypeKitchen(Kitchen floorTypeKitchen) {
        this.floorTypeKitchen = floorTypeKitchen;
    }

    public Kitchen getSqFtInKitchen() {
        return sqFtInKitchen;
    }

    public void setSqFtInKitchen(Kitchen sqFtInKitchen) {
        this.sqFtInKitchen = sqFtInKitchen;
    }

    public Kitchen getStoveType() {
        return stoveType;
    }

    public void setStoveType(Kitchen stoveType) {
        this.stoveType = stoveType;
    }

    public LivingRoom getSqFtInLivingRoom() {
        return sqFtInLivingRoom;
    }

    public void setSqFtInLivingRoom(LivingRoom sqFtInLivingRoom) {
        this.sqFtInLivingRoom = sqFtInLivingRoom;
    }

    public LivingRoom getFloorTypeLivingRm() {
        return floorTypeLivingRm;
    }

    public void setFloorTypeLivingRm(LivingRoom floorTypeLivingRm) {
        this.floorTypeLivingRm = floorTypeLivingRm;
    }

    public Basement getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Basement isFinished) {
        this.isFinished = isFinished;
    }

    public Basement getSqFtInBasement() {
        return sqFtInBasement;
    }

    public void setSqFtInBasement(Basement sqFtInBasement) {
        this.sqFtInBasement = sqFtInBasement;
    }

    public Bedroom getSqFtInBedroom() {
        return sqFtInBedroom;
    }

    public void setSqFtInBedroom(Bedroom sqFtInBedroom) {
        this.sqFtInBedroom = sqFtInBedroom;
    }

    public Bedroom getFloorTypeBedRm() {
        return floorTypeBedRm;
    }

    public void setFloorTypeBedRm(Bedroom floorTypeBedRm) {
        this.floorTypeBedRm = floorTypeBedRm;
    }
}
