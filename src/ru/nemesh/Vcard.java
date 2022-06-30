package ru.nemesh;

import java.math.BigDecimal;

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

    public BigDecimal getCurrentDiscountCard(BigDecimal amount) {

        amount = amount.multiply(BigDecimal.valueOf(discount));
        amount = amount.divide(BigDecimal.valueOf(100));

        return amount;
    }

}
