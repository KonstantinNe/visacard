package ru.nemesh;

public class VisaGoldCard {
    private String id;
    private String cardHolder;
    private int discount;
    public int amount;

    public void setId(String id) {
        this.id = id;
    }
    public void setCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
    }
    public int setDiscount(double setDiscount) {
        if (discount > 0);
        this.discount = discount;
        return discount;
    }
    public int getCurrentDiscount() {
        if (amount > 0);
        return amount*discount;
    }
}
