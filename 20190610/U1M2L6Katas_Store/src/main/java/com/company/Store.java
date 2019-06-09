/*
Store:
    Create the below classes representing multiple store types. They should be comprised of the below objects. Add any
    additional objects that you feel should be modeled as well. Each object should have state and behavior appropriate
    to them. Start by first creating a UML diagram. Then, using that as your guide, write the code for each class.
        Store:
        -Chips
        -Soda Pop
        -Chocolate
*/

package com.company;

public class Store {

    // Private Data Member(s)
    private String name;
    private int storeNumber;
    private String owner;

    // Other Class Data Members
    private Chips priceOfChips;
    private Chips chipsBrand;
    private Chips chipsQuantity;

    private SodaPop sodaBrand;
    private SodaPop priceOfSoda;
    private SodaPop sodaQuantity;

    private Chocolate chocolateBrand;
    private Chocolate chocolateQuantity;
    private Chocolate priceOfChocolate;

    // Class Method(s)
    public String changeOwner(String name) {
        return name;
    }

    // Class Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(int storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Other Class Getters and Setters
    public Chips getPriceOfChips() {
        return priceOfChips;
    }

    public void setPriceOfChips(Chips priceOfChips) {
        this.priceOfChips = priceOfChips;
    }

    public Chips getChipsBrand() {
        return chipsBrand;
    }

    public void setChipsBrand(Chips chipsBrand) {
        this.chipsBrand = chipsBrand;
    }

    public Chips getChipsQuantity() {
        return chipsQuantity;
    }

    public void setChipsQuantity(Chips chipsQuantity) {
        this.chipsQuantity = chipsQuantity;
    }

    public SodaPop getSodaBrand() {
        return sodaBrand;
    }

    public void setSodaBrand(SodaPop sodaBrand) {
        this.sodaBrand = sodaBrand;
    }

    public SodaPop getPriceOfSoda() {
        return priceOfSoda;
    }

    public void setPriceOfSoda(SodaPop priceOfSoda) {
        this.priceOfSoda = priceOfSoda;
    }

    public SodaPop getSodaQuantity() {
        return sodaQuantity;
    }

    public void setSodaQuantity(SodaPop sodaQuantity) {
        this.sodaQuantity = sodaQuantity;
    }

    public Chocolate getChocolateBrand() {
        return chocolateBrand;
    }

    public void setChocolateBrand(Chocolate chocolateBrand) {
        this.chocolateBrand = chocolateBrand;
    }

    public Chocolate getChocolateQuantity() {
        return chocolateQuantity;
    }

    public void setChocolateQuantity(Chocolate chocolateQuantity) {
        this.chocolateQuantity = chocolateQuantity;
    }

    public Chocolate getPriceOfChocolate() {
        return priceOfChocolate;
    }

    public void setPriceOfChocolate(Chocolate priceOfChocolate) {
        this.priceOfChocolate = priceOfChocolate;
    }
}
