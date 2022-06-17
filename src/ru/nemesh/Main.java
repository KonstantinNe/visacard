package ru.nemesh;

public class Main {
    public static void main(String[] args) {
        VisaClassicCard card = new VisaClassicCard();
        card.setId("1234567890");
        card.setCardHolder("Konstantin");
        card.setDiscount(0.5);
        double amount = 500;
        card.getCurrentDiscount(amount);
        System.out.println("Кэшбэк по карте " + card.getCardHolder()  + " от суммы " + amount + " составил " + card.getCurrentDiscount(amount) + " рублей");
    }
}

//double int 0 float 0.0 byte 0 boolean false char long (int)
//почитать про сужение и расширение типов
