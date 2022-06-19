package ru.nemesh;

public class Main {
    public static void main(String[] args) {
        double amount = 555.50;

        Vcard form = new Vcard();

        VisaClassicCard card = new VisaClassicCard();
        form.setId("1234567890");
        form.setDiscount(0.5);
        card.setCardHolder("Konstantin");
        form.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + form.getCurrentDiscountCard(amount) + " рублей");

        VisaGoldCard cardGold = new VisaGoldCard();
        form.setId("1234567891");
        cardGold.setCardHolderGold("Vladimir");
        form.setDiscount(1);
        form.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + cardGold.getCardHolderGold()  + " от суммы " + amount + " составил " + form.getCurrentDiscountCard(amount) + " рублей");

        VisaPlatinumCard cardPlatinum = new VisaPlatinumCard();
        form.setId("1234567892");
        cardPlatinum.setCardHolderPlatinum("Marina");
        form.setDiscount(1.5);
        form.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + cardPlatinum.getCardHolderPlatinum()  + " от суммы " + amount + " составил " + form.getCurrentDiscountCard(amount) + " рублей");
    }
}

//double int 0 float 0.0 byte 0 boolean false char long (int)
//почитать про сужение и расширение типов
