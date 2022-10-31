package com.kodilla.good.patterns.challenges.saleService;

import java.time.LocalDate;

public class EmailInformationService implements InformationService{

    @Override
    public void information(User user, Product product, LocalDate dateOfSale, boolean isSold) {
            if (isSold) {
                System.out.println("Hello, " + user.getUserName()
                        + " you just purchased " + product.getProductName()
                        + "\nDate of purchase: " + dateOfSale.toString()
                        + "\nPrice: " + product.getPrice() + " PLN");
            } else {
                System.out.println("Dzień dobry, " + user.getUserName()
                        + " niestety nie możemy zrealizować Twojego zamówienia");
            }
    }
}
