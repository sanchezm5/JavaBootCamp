/*
Restaurant:
    Create the below classes representing multiple store types. They should be comprised of the below objects. Add any
    additional objects that you feel should be modeled as well. Each object should have state and behavior appropriate
    to them. Start by first creating a UML diagram. Then, using that as your guide, write the code for each class.
        Restaurant:
        -Soda Pop or Beverage
*/

package com.company;

public class Restaurant {

    // Private Data Member(s)
    private String name;
    private int restaurantNumber;
    private String owner;

    // Other Class Data Member(s)
    private Beverage beverage;
    private Beverage beveragePrice;

    private Appetizers appetizer;
    private Appetizers appetizerPrice;

    private Entree entree;
    private Entree entreePrice;

    private Desserts dessert;
    private Desserts dessertPrice;

    // Class Method(s)
    public String changeOwner(String newOwner) {
        return newOwner;
    }

    // Class Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(int restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Other Class Getters and Setters
    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeveragePrice() {
        return beveragePrice;
    }

    public void setBeveragePrice(Beverage beveragePrice) {
        this.beveragePrice = beveragePrice;
    }

    public Appetizers getAppetizer() {
        return appetizer;
    }

    public Entree getEntree() {
        return entree;
    }

    public void setEntree(Entree entree) {
        this.entree = entree;
    }

    public Entree getEntreePrice() {
        return entreePrice;
    }

    public void setEntreePrice(Entree entreePrice) {
        this.entreePrice = entreePrice;
    }

    public void setAppetizer(Appetizers appetizer) {
        this.appetizer = appetizer;
    }

    public Appetizers getAppetizerPrice() {
        return appetizerPrice;
    }

    public void setAppetizerPrice(Appetizers appetizerPrice) {
        this.appetizerPrice = appetizerPrice;
    }

    public Desserts getDessert() {
        return dessert;
    }

    public void setDessert(Desserts dessert) {
        this.dessert = dessert;
    }

    public Desserts getDessertPrice() {
        return dessertPrice;
    }

    public void setDessertPrice(Desserts dessertPrice) {
        this.dessertPrice = dessertPrice;
    }
}
