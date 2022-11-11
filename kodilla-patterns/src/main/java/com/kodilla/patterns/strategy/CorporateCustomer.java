package com.kodilla.patterns.strategy;

public non-sealed class CorporateCustomer extends Customer{

    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
