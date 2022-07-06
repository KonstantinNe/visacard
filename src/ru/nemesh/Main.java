package ru.nemesh;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal(555.5);

        Vcard cardClassic = new VisaClassicCard("1234567890", "Konstantin", 0.5);
        Vcard cardGold = new VisaGoldCard("1234567891", "Vladimir", 1);
        Vcard cardPlatinum = new VisaPlatinumCard("1234567892", "Marina", 1.5);

        cardClassic.getCurrentDiscountCard(amount);
        System.out.print("Кэшбэк по карте " + ((VisaClassicCard) cardClassic).cardHolder + " от суммы " + amount + " составил " + cardClassic.getCurrentDiscountCard(amount) + " рублей");
        
        cardGold.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + ((VisaGoldCard) cardGold).cardHolder  + " от суммы " + amount + " составил " + cardGold.getCurrentDiscountCard(amount) + " рублей");

        cardPlatinum.getCurrentDiscountCard(amount);
        System.out.println("Кэшбэк по карте " + ((VisaPlatinumCard) cardPlatinum).cardHolder  + " от суммы " + amount + " составил " + cardPlatinum.getCurrentDiscountCard(amount) + " рублей");
    }
}

//double int 0 float 0.0 byte 0 boolean false char long (int)
//почитать про сужение и расширение типов
