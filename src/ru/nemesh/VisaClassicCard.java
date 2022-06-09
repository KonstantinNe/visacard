package ru.nemesh;

public class VisaClassicCard {
    public String id;
    public String cardHolder;
    public int discount;
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
    public void getCurrentDiscount() {
        if (amount > 0);
        discount = (int) (amount*discount);
    }
}
