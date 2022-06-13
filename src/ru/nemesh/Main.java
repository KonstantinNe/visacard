package ru.nemesh;

public class Main {
    public static void main(String[] args) {
        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setCardHolder("Konstantin");
        String discount = String.valueOf(0.5);
        String amount = String.valueOf(500);
        card.getCurrentDiscount(amount,discount);
        System.out.println("Кэшбэк по карте " + "Konstantin" + " от суммы "  + amount + " составил " + card.resultDiscount + " рублей");
        return;
    }
}
