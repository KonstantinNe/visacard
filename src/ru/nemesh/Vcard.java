package ru.nemesh;

import java.math.BigDecimal;

public abstract class Vcard{
    private String id;
    private String cardHolder;
    private double discount;

    public Vcard(String id, String cardHolder, double discount) {
        this.id = id;
        this.cardHolder = cardHolder;
        this.discount = discount;
    }

    public String getId() {
        return id;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public double getDiscount() {
        return discount;
    }
}
