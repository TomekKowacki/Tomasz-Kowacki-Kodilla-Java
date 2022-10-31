package com.kodilla.good.patterns.challenges.saleService;

import java.time.LocalDate;

public class Order {
    private User user;

    private LocalDate dateOfSale;
    private Product product;

    public Order(User user, LocalDate dateOfSale, Product product) {
        this.user = user;
        this.dateOfSale = dateOfSale;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public Product getProduct() {
        return product;
    }
}
