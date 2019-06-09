package com.company;

public class Mints {

    // Private Data Member(s)
    private float priceOfMints;
    private String mintsBrand;
    private int mintsQuantity;

    // Class Method(s)
    public float changeMintsPrice(float newPrice) {
        return newPrice;
    }

    public float buyMints(float price, float qty) {
        return price * qty;
    }

    // Class Getters and Setters
    public float getPriceOfMints() {
        return priceOfMints;
    }

    public void setPriceOfMints(float priceOfMints) {
        this.priceOfMints = priceOfMints;
    }

    public String getMintsBrand() {
        return mintsBrand;
    }

    public void setMintsBrand(String mintsBrand) {
        this.mintsBrand = mintsBrand;
    }

    public int getMintsQuantity() {
        return mintsQuantity;
    }

    public void setMintsQuantity(int mintsQuantity) {
        this.mintsQuantity = mintsQuantity;
    }

}
