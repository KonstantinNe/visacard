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
    public Object setDiscount(double setDiscount) { this.discount = discount;
        return discount;
    }
    public void setAmount(int setAmount) { this.amount = amount;}

    public int getCurrentDiscount() {
        return resultDiscount = (int) (0.5*500);
    }
}
