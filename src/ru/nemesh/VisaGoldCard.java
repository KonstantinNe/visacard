package ru.nemesh;

public class VisaGoldCard {
    private String id;
    private String cardHolderGold;
    private double discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardHolderGold() {
        return cardHolderGold;
    }

    public void setCardHolderGold(String cardHolderGold) {
        this.cardHolderGold = cardHolderGold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
        public double getCurrentDiscountGoldCard(double amount) {
        return (discount * amount/100);

    }
}
