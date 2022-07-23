package ru.nemesh;

public class VisaClassicCard extends Vcard implements Cashback {

    public VisaClassicCard(String id, String cardHolder, double discount) {
        super(id, cardHolder, discount);
    }

    @Override
    public double getDiscount() {
        return super.getDiscount();
    }
}