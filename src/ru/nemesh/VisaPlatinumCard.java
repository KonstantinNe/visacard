package ru.nemesh;

public class VisaPlatinumCard {
    private String id;
    private String cardHolderPlatinum;
    private double discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardHolderPlatinum() {
        return cardHolderPlatinum;
    }

    public void setCardHolderPlatinum(String cardHolderPlatinum) {
        this.cardHolderPlatinum = cardHolderPlatinum;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCurrentDiscountPlatinumCard(double amount) {
            return (discount * amount/100);
        }
    }
