/*
Phones:
    -Open phones.xml and look at the data within.
    -Create an appropriate Java object based on the contents of the file.
    -Create a Java file called PhoneReader.
    -Use Jackson to read the data from the file and store it in a list.
    -Print the contents of the list.
 */

package com.company;

// Create a Phone Class
public class Phone {

    // Properties
    private String brand;
    private String model;
    private String processor;
    private int storage;
    private double price;

    // Constructor
    public Phone(String brand, String model, String processor, int storage, double price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.storage = storage;
        this.price = price;
    }

    public Phone() {

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

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
