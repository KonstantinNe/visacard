package ru.nemesh;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal(555.50);

        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setCardHolder("Konstantin");
        card.setDiscount(0.5);
        card.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + card.getCurrentDiscountCard(amount) + " рублей");

        VisaGoldCard cardGold = new VisaGoldCard();
        cardGold.setId("1234567891");
        cardGold.setCardHolder("Vladimir");
        cardGold.setDiscount(1);
        cardGold.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + cardGold.getCardHolder()  + " от суммы " + amount + " составил " + cardGold.getCurrentDiscountCard(amount) + " рублей");

        VisaPlatinumCard cardPlatinum = new VisaPlatinumCard();
        cardPlatinum.setId("1234567892");
        cardPlatinum.setCardHolder("Marina");
        cardPlatinum.setDiscount(1.5);
        cardPlatinum.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + cardPlatinum.getCardHolder()  + " от суммы " + amount + " составил " + cardPlatinum.getCurrentDiscountCard(amount) + " рублей");
    }
}

//double int 0 float 0.0 byte 0 boolean false char long (int)
//почитать про сужение и расширение типов
