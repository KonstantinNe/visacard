package ru.nemesh;

public class VisaClassicCard {
    private String id;
    private String cardHolder;
    public int resultDiscount;
    public double discount;
    public int amount;

    public void setId(String id) { this.id = id;}
    public void setCardHolder(String cardHolder){this.cardHolder = cardHolder;}

    public int getCurrentDiscount(String amount, String discount) {
        return resultDiscount;
    }
}
