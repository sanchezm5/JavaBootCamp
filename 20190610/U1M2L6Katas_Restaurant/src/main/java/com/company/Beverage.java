package com.company;

public class Beverage {

    // Private Data Member(s)
    private String beverage;
    private float beveragePrice;

    // Class Method(s)
    public float changeBeveragePrice(float newPrice) {
        return newPrice;
    }

    // Class Getters and Setters
    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public float getBeveragePrice() {
        return beveragePrice;
    }

    public void setBeveragePrice(float beveragePrice) {
        this.beveragePrice = beveragePrice;
    }
}
