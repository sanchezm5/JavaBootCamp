package com.company;

public class SodaPop {

    // Private Data Member(s)
    private String sodaBrand;
    private float priceOfSoda;
    private int sodaQuantity;

    // Class Method(s)
    public float changeSodaPrice(float newPrice) {
        return newPrice;
    }

    public float buySoda(float price, float qty) {
        return price * qty;
    }

    // Class Getters and Setters
    public String getSodaBrand() {
        return sodaBrand;
    }

    public void setSodaBrand(String sodaBrand) {
        this.sodaBrand = sodaBrand;
    }

    public float getPriceOfSoda() {
        return priceOfSoda;
    }

    public void setPriceOfSoda(float priceOfSoda) {
        this.priceOfSoda = priceOfSoda;
    }

    public int getSodaQuantity() {
        return sodaQuantity;
    }

    public void setSodaQuantity(int sodaQuantity) {
        this.sodaQuantity = sodaQuantity;
    }
}
