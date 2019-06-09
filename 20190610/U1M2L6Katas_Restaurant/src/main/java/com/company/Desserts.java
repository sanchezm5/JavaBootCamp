package com.company;

public class Desserts {

    // Private Data Member(s)
    private String dessert;
    private float dessertPrice;

    // Class Method(s)
    public float changeDessertPrice(float newPrice) {
        return newPrice;
    }

    // Class Getters and Setters
    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public float getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(float dessertPrice) {
        this.dessertPrice = dessertPrice;
    }
}
