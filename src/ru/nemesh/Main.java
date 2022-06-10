package ru.nemesh;

public class Main {
    public static void main(String[]  args) {
        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setCardHolder("Konstantin");
        card.setDiscount(0.5);
        int amount = 500;

        String getCurentDiscount(int amount);
    }
}
