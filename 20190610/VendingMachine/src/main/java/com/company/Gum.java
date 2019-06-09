package com.company;

public class Gum {

    // Private Data Member(s)
    private float priceOfGum;
    private String gumBrand;
    private int gumQuantity;

    // Class Method(s)
    public float changeGumPrice(float newPrice) {
        return newPrice;
    }

    public float buyGum(float price, float qty) {
        return price * qty;
    }

    // Class Getters and Setters
    public float getPriceOfGum() {
        return priceOfGum;
    }

    public void setPriceOfGum(float priceOfGum) {
        this.priceOfGum = priceOfGum;
    }

    public String getGumBrand() {
        return gumBrand;
    }

    public void setGumBrand(String gumBrand) {
        this.gumBrand = gumBrand;
    }

    public int getGumQuantity() {
        return gumQuantity;
    }

    public void setGumQuantity(int gumQuantity) {
        this.gumQuantity = gumQuantity;
    }
}
