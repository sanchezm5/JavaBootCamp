/*
Televisions:
    -Open televisions.json and look at the data within.
    -Create an appropriate Java object based on the contents of the file.
    -Create a Java file called TelevisionReader.
    -Use Jackson to read the data from the file and store it in a list.
    -Print the contents of the list.
 */

package com.company;

// Create a Television Class
public class Television {

    // Properties
    private String brand;
    private String model;
    private double price;
    private int screenSize;

    // Constructor
    public Television(String brand, String model, double price, int screenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    public Television() {

    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

}
