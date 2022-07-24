package ru.nemesh;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("555.50");
        amount = amount.setScale(2, RoundingMode.HALF_EVEN);

        Check check = new Check();
        List list = Arrays.asList("first step", null, "second step");

        Vcard cardClassic = new VisaClassicCard("1234567890", "Konstantin", 0.5);
        Vcard cardGold = new VisaGoldCard("1234567891", "Vladimir", 1);
        Vcard cardPlatinum = new VisaPlatinumCard("1234567892", "Marina", 1.5);


        List<Vcard> cards = new ArrayList<>();
        cards.add(cardClassic);
        cards.add(cardGold);
        cards.add(cardPlatinum);

        for (Vcard card : cards) {
            try {
                check.check(amount);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("Баланс на карте" + card.getCardHolder() + "положительный. Операция обрабатывается");
            } finally {
                System.out.printf("Кэшбэк по карте %s от суммы %s составил %s рублей \n", card.getCardHolder(), amount, Cashback.getCurrentDiscountCard(amount));
            }
        }
    }
}

//double int 0 float 0.0 byte 0 boolean false char long (int)
//почитать про сужение и расширение типов
