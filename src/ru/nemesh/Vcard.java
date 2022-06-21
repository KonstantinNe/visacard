package ru.nemesh;

public abstract class Vcard {
    private String id;
    private double discount;
    private String cardHolder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public double getCurrentDiscountCard(double amount) {
        return (discount * amount / 100);
    }
}
