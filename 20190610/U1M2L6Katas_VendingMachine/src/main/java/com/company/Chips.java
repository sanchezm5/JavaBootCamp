package com.company;

public class Chips {

    // Private Data Member(s)
    private float priceOfChips;
    private String chipsBrand;
    private int chipsQuantity;

    // Class Method(s)
    public float changeChipsPrice(float newPrice) {
        return newPrice;
    }

    public float buyChips(float price, float qty) {
        return price * qty;
    }

    // Class Getters and Setters
    public float getPriceOfChips() {
        return priceOfChips;
    }

    public void setPriceOfChips(float priceOfChips) {
        this.priceOfChips = priceOfChips;
    }

    public String getChipsBrand() {
        return chipsBrand;
    }

    public void setChipsBrand(String chipsBrand) {
        this.chipsBrand = chipsBrand;
    }

    public int getChipsQuantity() {
        return chipsQuantity;
    }

    public void setChipsQuantity(int chipsQuantity) {
        this.chipsQuantity = chipsQuantity;
    }
}
