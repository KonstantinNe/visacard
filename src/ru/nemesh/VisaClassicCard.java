package ru.nemesh;

public class VisaClassicCard {
    public String setAmount;
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

    public void getCurrentDiscount() {
        resultDiscount = (int) (this.amount *discount);
        return;
    }
}
