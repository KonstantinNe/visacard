package ru.nemesh;

import java.math.BigDecimal;

public class VisaClassicCard extends Vcard implements Cashback {

    public BigDecimal getCurrentDiscountCard(BigDecimal amount) {
        amount = amount.multiply(BigDecimal.valueOf(getDiscount()));
        amount = amount.divide(BigDecimal.valueOf(100));
        return amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public VisaClassicCard(String id, String cardHolder, double discount) {
        super(id, cardHolder, discount);

    }

}