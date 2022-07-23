package ru.nemesh;

import java.math.BigDecimal;

public abstract class Vcard {
    public static double discount;
    private String id;
    private static String cardHolder;

    public Vcard(String id, String cardHolder, double discount) {
        this.id = id;
        this.cardHolder = cardHolder;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public String getId() {
        return id;
    }

    public String getCardHolder() {
        return cardHolder;
    }

}
