package ru.nemesh;

public class Main {
    public static void main(String[] args) {
        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setCardHolder("Konstantin");
        card.setDiscount(0.5);
        card.setAmount(500);

        VisaGoldCard cardgold = new VisaGoldCard();
        card.setId("11111111111");
        card.setCardHolder("Vladimir");
        card.setDiscount(1);
        card.getCurrentDiscount(500);
        System.out.println("Кэшбэк по карте " + "Konstantin" + " от суммы "  + card.amount + " составил " + card.resultDiscount + " рублей");
        return;
    }
}
