package com.kodilla.good.patterns.challenges.Food2Door;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private int quantity;
    private BigDecimal price;

    public Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = BigDecimal.valueOf(price);
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setQuantityAfterSale(int volumeOfPurchase) {
        this.quantity = quantity-volumeOfPurchase;
    }

    @Override
    public String toString() {
        return "Product..." + productName + '\'' +
                ", quantity = " + quantity +
                ", price = " + price;
    }
}
