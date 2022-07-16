package ru.nemesh;
 import java.math.BigDecimal;

public abstract class Vcard<discount> {
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

    public BigDecimal getCurrentDiscountCard(BigDecimal amount){

            amount = amount.multiply(BigDecimal.valueOf(discount));
            amount = amount.divide(BigDecimal.valueOf(100));
            return amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        }
    }
