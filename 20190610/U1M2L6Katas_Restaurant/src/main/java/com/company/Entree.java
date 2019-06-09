package com.company;

public class Entree {

    // Private Data Member(s)
    private String entree;
    private float entreePrice;

    // Class Method(s)
    public float changeEntreePrice(float newPrice) {
        return newPrice;
    }

    // Class Getters and Setters
    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public float getEntreePrice() {
        return entreePrice;
    }

    public void setEntreePrice(float entreePrice) {
        this.entreePrice = entreePrice;
    }
}
