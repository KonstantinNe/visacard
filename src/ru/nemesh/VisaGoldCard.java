package ru.nemesh;

public class VisaGoldCard extends Vcard implements Cashback {
    public VisaGoldCard(String id, String cardHolder, double discount) {
        super(id, cardHolder, discount);
    }

    @Override
    public double getDiscount() {
        return super.getDiscount();
    }
}
