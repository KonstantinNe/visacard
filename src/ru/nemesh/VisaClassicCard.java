package ru.nemesh;

public class VisaClassicCard {
    public int resultDiscount;
    private String id;
    private String cardHolder;
    int discount;
    public int amount;

    public void setId(String id) {
        this.id = id;
    }
    public void setCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
    }
    public int setDiscount(double setDiscount) { this.discount = discount;
        return discount;
    }

    public void getCurrentDiscount(int amount) {
        resultDiscount = amount*discount;
        return;
    }
}
