package ru.nemesh;

public class VisaClassicCard {
    private String id;
    private String cardHolder;
    private double discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCurrentDiscountClassicCard(double amount) {
        return (discount * amount / 100);
    }
}
