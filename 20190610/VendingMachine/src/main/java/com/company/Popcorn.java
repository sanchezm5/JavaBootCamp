package com.company;

public class Popcorn {

    // Private Data Member(s)
    private float priceOfPopcorns;
    private String popCornBrand;
    private int popCornQuantity;

    // Class Method(s)
    public float changePopCornPrice(float newPrice) {
        return newPrice;
    }

    public float buyPopCorn(float price, float qty) {
        return price * qty;
    }

    // Class Getters and Setters
    public float getPriceOfPopcorns() {
        return priceOfPopcorns;
    }

    public void setPriceOfPopcorns(float priceOfPopcorns) {
        this.priceOfPopcorns = priceOfPopcorns;
    }

    public String getPopCornBrand() {
        return popCornBrand;
    }

    public void setPopCornBrand(String popCornBrand) {
        this.popCornBrand = popCornBrand;
    }

    public int getPopCornQuantity() {
        return popCornQuantity;
    }

    public void setPopCornQuantity(int popCornQuantity) {
        this.popCornQuantity = popCornQuantity;
    }
}
