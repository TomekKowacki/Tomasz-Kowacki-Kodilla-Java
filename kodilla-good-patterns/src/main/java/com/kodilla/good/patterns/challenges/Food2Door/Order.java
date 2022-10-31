package com.kodilla.good.patterns.challenges.Food2Door;


import java.time.LocalDate;

public class Order {

    private Product product;
    private int volumeOfPurchase;
    private User user;
    private LocalDate dateOfSale;

    public Order(Product product, int volumeOfPurchase, User user, LocalDate dateOfSale) {
        this.product = product;
        this.volumeOfPurchase = volumeOfPurchase;
        this.user = user;
        this.dateOfSale = dateOfSale;
    }

    public Product getProduct() {
        return product;
    }

    public int getVolumeOfPurchase() {
        return volumeOfPurchase;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }
}
