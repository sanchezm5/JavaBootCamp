package com.company;

public class Car {

    // Properties
    private String model;
    private String make;
    private String year;
    private String color;
    private int miles;

    // Constructor
    public Car(String model, String make, String year, String color, int miles) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

}
