package ru.nemesh;

import java.math.BigDecimal;

public class VisaPlatinumCardVip extends Vcard {

    public VisaPlatinumCardVip(String id, String cardHolder, double discount) {
        super(id, cardHolder, discount);
    }

    public BigDecimal getCurrentDiscountCard(BigDecimal amount) {

        amount = amount.multiply(BigDecimal.valueOf(getDiscount()));
        amount = amount.divide(BigDecimal.valueOf(10));
        return amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
}
