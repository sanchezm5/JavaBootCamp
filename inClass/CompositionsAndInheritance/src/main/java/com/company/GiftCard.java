package com.company;

public class GiftCard {

    // Private data members
    private String giftCardNum;
    private double amount;
    private String expDate;
    private boolean isActivated;

    // Constructor
    public GiftCard(String giftCardNum, double amount, String expDate, boolean isActivated) {
        this.giftCardNum = giftCardNum;
        this.amount = amount;
        this.expDate = expDate;
        this.isActivated = isActivated;
    }

    // Getters and Setters

    // giftCardNum is read only so there is only a getter not a setter
    public String getGiftCardNum() {
        return giftCardNum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
