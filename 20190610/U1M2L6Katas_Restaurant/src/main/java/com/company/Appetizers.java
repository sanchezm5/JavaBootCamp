package com.company;

public class Appetizers {

    // Private Data Member(s)
    private String appetizer;
    private float appetizerPrice;

    // Class Method(s)
    public float changeAppPrice(float newPrice) {
        return newPrice;
    }

    // Class Getters and Setters
    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    public float getAppetizerPrice() {
        return appetizerPrice;
    }

    public void setAppetizerPrice(float appetizerPrice) {
        this.appetizerPrice = appetizerPrice;
    }
}
