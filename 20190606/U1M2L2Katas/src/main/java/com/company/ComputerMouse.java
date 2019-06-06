package com.company;

// Encapsulated Class
public class ComputerMouse {

    // Private Data Members (variables)
    private String manufacturer;
    private String model;
    private int xPosition;
    private int yPosition;
    private int[] lastClickedLocation;

    // Constructor
    public ComputerMouse(String manufacturer, String model, int xPosition, int yPosition, int[] lastClickedLocation) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.lastClickedLocation = lastClickedLocation;
    }

    // Getters and Setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int[] getLastClickedLocation() {
        return lastClickedLocation;
    }

    public void setLastClickedLocation(int[] lastClickedLocation) {
        this.lastClickedLocation = lastClickedLocation;
    }

    // Other Methods
    public void move(int deltaX, int deltaY) {

    }

    public void click(int i) {

    }

}
