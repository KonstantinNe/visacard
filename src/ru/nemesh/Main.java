package ru.nemesh;

public class Main {
    public static void main(String[] args) {
        double amount = 555.50;

        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setDiscount(0.5);
        card.setCardHolder("Konstantin");
        card.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + card.getCurrentDiscountCard(amount) + " рублей");

        VisaGoldCard cardGold = new VisaGoldCard(); 
        card.setId("1234567891");
        card.setCardHolder("Vladimir");
        card.setDiscount(1);
        card.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + card.getCurrentDiscountCard(amount) + " рублей");

        VisaPlatinumCard cardPlatinum = new VisaPlatinumCard();
        card.setId("1234567892");
        card.setCardHolder("Marina");
        card.setDiscount(1.5);
        card.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + card.getCurrentDiscountCard(amount) + " рублей");
    }
}

//double int 0 float 0.0 byte 0 boolean false char long (int)
//почитать про сужение и расширение типов
