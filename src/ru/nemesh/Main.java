package ru.nemesh;

public class Main {
    public static void main(String[] args) {
        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setCardHolder("Konstantin");
        double discount = 0.5;
        int amount = 500;
        int resultDiscount = card.getResultDiscount();
        card.getCurrentDiscount(amount, discount);
        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + card.getResultDiscount() + " рублей");
        return1;
    }
}
