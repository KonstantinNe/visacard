package ru.nemesh;

public class Vcard {       //form, Vcard form = new Vcard()
    private String id;
    private double discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCurrentDiscountCard(double amount) {
        return (discount * amount / 100);
    }
}
