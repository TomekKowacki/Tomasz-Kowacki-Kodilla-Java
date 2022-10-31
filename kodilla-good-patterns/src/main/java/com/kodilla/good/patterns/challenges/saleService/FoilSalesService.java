package com.kodilla.good.patterns.challenges.saleService;

import java.time.LocalDate;

public class FoilSalesService implements SalesService {

    @Override
    public boolean sale(User user, LocalDate dateOfSale, Product product) {
        System.out.println("Sale of " + product.getProductName() + " on " + dateOfSale.toString()
                + ", buyer: " + user.getFirstName());
        return true;
    }
}
