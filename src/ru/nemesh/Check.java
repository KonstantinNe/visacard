package ru.nemesh;

import java.math.BigDecimal;

public class Check {
    void check(BigDecimal amount) {
        if (amount == null) {
            throw new NullPointerException("Исключение: сумма равна нулю!");
        }
    }
}
