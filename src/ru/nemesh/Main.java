package ru.nemesh;

public class Main {
    public static void main(String[] args) {
        double amount = 555.50;

        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setCardHolder("Konstantin");
        card.setDiscount(0.5);
        card.getCurrentDiscountClassicCard(amount);

        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + card.getCurrentDiscountClassicCard(amount) + " рублей");

        VisaGoldCard cardGold = new VisaGoldCard();
        cardGold.setId("1234567891");
        cardGold.setCardHolderGold("Vladimir");
        cardGold.setDiscount(1);
        cardGold.getCurrentDiscountGoldCard(amount);
        System.out.println("Кэшбэк по карте " + cardGold.getCardHolderGold()  + " от суммы " + amount + " составил " + cardGold.getCurrentDiscountGoldCard(amount) + " рублей");

        VisaPlatinumCard cardPlatinum = new VisaPlatinumCard();
        cardPlatinum.setId("1234567892");
        cardPlatinum.setCardHolderPlatinum("Marina");
        cardPlatinum.setDiscount(1.5);
        cardPlatinum.getCurrentDiscountPlatinumCard(amount);
        System.out.println("Кэшбэк по карте " + cardPlatinum.getCardHolderPlatinum()  + " от суммы " + amount + " составил " + cardPlatinum.getCurrentDiscountPlatinumCard(amount) + " рублей");
    }
}

//double int 0 float 0.0 byte 0 boolean false char long (int)
//почитать про сужение и расширение типов
