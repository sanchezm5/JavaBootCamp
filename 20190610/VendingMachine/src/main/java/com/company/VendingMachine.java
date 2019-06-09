/*
Vending Machine:
    Create the below classes representing multiple store types. They should be comprised of the below objects. Add any
    additional objects that you feel should be modeled as well. Each object should have state and behavior appropriate
    to them. Start by first creating a UML diagram. Then, using that as your guide, write the code for each class.
        Vending Machine:
        -Chips
        -Soda Pop
        -Chocolate
        -Mints
        -Gum
        -Popcorn
*/

package com.company;

public class VendingMachine {

    // Private Data Member(s)
    private int numberOfItems;
    private float totalInMachine;

    // Other Data Member(s)
    private SodaPop sodaBrand;
    private SodaPop priceOfSoda;
    private SodaPop sodaQuantity;

    private Chips priceOfChips;
    private Chips chipsBrand;
    private Chips chipsQuantity;

    private Chocolate chocolateBrand;
    private Chocolate chocolateQuantity;
    private Chocolate priceOfChocolate;

    private Gum priceOfGum;
    private Gum gumBrand;
    private Gum gumQuantity;

    private Mints priceOfMints;
    private Mints mintsBrand;
    private Mints mintsQuantity;

    private Popcorn priceOfPopcorns;
    private Popcorn popCornBrand;
    private Popcorn popCornQuantity;

    // Class Method(s)
    public void addItems(int num) {

    }

    public float addMoney(float amount) {
        return amount;
    }

    // Class Getters and Setters
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public float getTotalInMachine() {
        return totalInMachine;
    }

    public void setTotalInMachine(float totalInMachine) {
        this.totalInMachine = totalInMachine;
    }

    // Other Class Getters and Setters
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

    public Gum getPriceOfGum() {
        return priceOfGum;
    }

    public void setPriceOfGum(Gum priceOfGum) {
        this.priceOfGum = priceOfGum;
    }

    public Gum getGumBrand() {
        return gumBrand;
    }

    public void setGumBrand(Gum gumBrand) {
        this.gumBrand = gumBrand;
    }

    public Gum getGumQuantity() {
        return gumQuantity;
    }

    public void setGumQuantity(Gum gumQuantity) {
        this.gumQuantity = gumQuantity;
    }

    public Mints getPriceOfMints() {
        return priceOfMints;
    }

    public void setPriceOfMints(Mints priceOfMints) {
        this.priceOfMints = priceOfMints;
    }

    public Mints getMintsBrand() {
        return mintsBrand;
    }

    public void setMintsBrand(Mints mintsBrand) {
        this.mintsBrand = mintsBrand;
    }

    public Mints getMintsQuantity() {
        return mintsQuantity;
    }

    public void setMintsQuantity(Mints mintsQuantity) {
        this.mintsQuantity = mintsQuantity;
    }

    public Popcorn getPriceOfPopcorns() {
        return priceOfPopcorns;
    }

    public void setPriceOfPopcorns(Popcorn priceOfPopcorns) {
        this.priceOfPopcorns = priceOfPopcorns;
    }

    public Popcorn getPopCornBrand() {
        return popCornBrand;
    }

    public void setPopCornBrand(Popcorn popCornBrand) {
        this.popCornBrand = popCornBrand;
    }

    public Popcorn getPopCornQuantity() {
        return popCornQuantity;
    }

    public void setPopCornQuantity(Popcorn popCornQuantity) {
        this.popCornQuantity = popCornQuantity;
    }
}
