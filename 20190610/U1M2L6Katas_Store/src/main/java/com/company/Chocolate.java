package com.company;

public class Chocolate {

    // Private Data Member(s)
    private String chocolateBrand;
    private int chocolateQuantity;
    private float priceOfChocolate;

    // Class Method(s)
    public float changeChocPrice(float newPrice) {
        return newPrice;
    }

    // Class Getters and Setters
    public String getChocolateBrand() {
        return chocolateBrand;
    }

    public void setChocolateBrand(String chocolateBrand) {
        this.chocolateBrand = chocolateBrand;
    }

    public int getChocolateQuantity() {
        return chocolateQuantity;
    }

    public void setChocolateQuantity(int chocolateQuantity) {
        this.chocolateQuantity = chocolateQuantity;
    }

    public float getPriceOfChocolate() {
        return priceOfChocolate;
    }

    public void setPriceOfChocolate(float priceOfChocolate) {
        this.priceOfChocolate = priceOfChocolate;
    }
}
