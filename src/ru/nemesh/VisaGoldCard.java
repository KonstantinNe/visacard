package ru.nemesh;

import java.math.BigDecimal;

public class VisaGoldCard extends Vcard implements Cashback {


    public BigDecimal getCurrentDiscountCard(BigDecimal amount) {
        amount = amount.multiply(BigDecimal.valueOf(getDiscount()));
        amount = amount.divide(BigDecimal.valueOf(100));
        return amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }

    public VisaGoldCard(String id, String cardHolder, double discount) {
        super(id, cardHolder, discount);
    }

}