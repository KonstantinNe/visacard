package ru.nemesh;
 import java.math.BigDecimal;

public abstract class Vcard {
    private String id;
    String cardHolder;
    private double discount;

    public Vcard(String id, String cardHolder, double discount) {
        this.id = id;
        this.cardHolder = cardHolder;
        this.discount = discount;
    }

    public static BigDecimal getCurrentDiscountCard(BigDecimal amount) {

        amount = amount.multiply(BigDecimal.valueOf(discount));
        amount = amount.divide(BigDecimal.valueOf(100));
        return amount;
    }
}
