package ru.nemesh;

import java.math.BigDecimal;

public interface Cashback {

    public static BigDecimal getCurrentDiscountCard(BigDecimal amount) {

        amount = amount.multiply(BigDecimal.valueOf(Vcard.discount));
        amount = amount.divide(BigDecimal.valueOf(100));
        return amount.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
}

