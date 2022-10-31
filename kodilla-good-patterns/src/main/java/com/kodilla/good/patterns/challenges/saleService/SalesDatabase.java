package com.kodilla.good.patterns.challenges.saleService;

import java.time.LocalDate;

public class SalesDatabase implements SalesRepository{
    @Override
    public void createSaleProduct(User user, Product product, LocalDate dateOfSale) {
        System.out.println(dateOfSale.toString() + ". Sold " + product.getProductName() + " to user " + user.getUserName()
                + " at a price " + product.getPrice()
                + "\nContact Email: " + user.getUserEMail());
    }
}
