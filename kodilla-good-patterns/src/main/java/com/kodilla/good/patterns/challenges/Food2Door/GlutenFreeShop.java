package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements ProducerProcess {

    private String name;
    private String headquartersAddress;

    public GlutenFreeShop(String name, String headquartersAddress) {
        this.name = name;
        this.headquartersAddress = headquartersAddress;
    }

    @Override
    public void process(Product getProduct, int volumeOfPurchase) {
        System.out.println("\nWe are just completing your order");
    }

    @Override
    public String toString() {
        return "\nGlutenFreeShop" +
                ",\t headquartersAddress = " + headquartersAddress
                + "...\n";
    }
}
