package ru.nemesh;

public class VisaClassicCard {
    private String id;
    private String cardHolder;
    public int resultDiscount;
    public double discount;
    public int amount;

    public void setId(String id) {
        this.id = id;
    }
    public void setCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
    }
    public void setDiscount(double setDiscount) { this.discount = discount;}
    public void setAmount(int setAmount) { this.amount = amount;}

    public void getCurrentDiscount(int resultDiscount) {
        resultDiscount = (int) (this.amount *discount);
        return;
    }
}
