package ru.nemesh;

public class VisaGoldCard {
    private String id;
    private String cardHolder;
    private int resultDiscount;
    private double discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getResultDiscount() {
        return resultDiscount;
    }

    public void setResultDiscount(int resultDiscount) {
        this.resultDiscount = resultDiscount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getCurrentDiscount(int amount, double discount) {
        resultDiscount = (int) (discount * amount);
        return resultDiscount;
    }
}
