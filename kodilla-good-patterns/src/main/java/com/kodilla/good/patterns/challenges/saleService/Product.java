package com.kodilla.good.patterns.challenges.saleService;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private BigDecimal price;

    public Product(String productName, BigDecimal price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
