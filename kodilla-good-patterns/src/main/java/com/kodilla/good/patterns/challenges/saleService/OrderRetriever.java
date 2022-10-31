package com.kodilla.good.patterns.challenges.saleService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderRetriever {

    public Order retrieve() {

        User user = new User("Tomasz", "Balooon", 123455, "balooon@gmail.com");
        Product product = new Product("transparent foil", BigDecimal.valueOf(199.99));
        Order order = new Order(user, LocalDate.of(2022, 11, 01), product);

        return order;
    }
}
