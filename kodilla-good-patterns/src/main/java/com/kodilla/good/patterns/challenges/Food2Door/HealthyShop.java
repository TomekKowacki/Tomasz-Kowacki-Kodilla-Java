package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements ProducerProcess {

    private String name;
    private String headquartersAddress;

    public HealthyShop(String name, String headquartersAddress) {
        this.name = name;
        this.headquartersAddress = headquartersAddress;
    }
    @Override
    public void process(Product getProduct, int volumeOfPurchase) {
        System.out.print("\nYour order is already completed");
    }

    @Override
    public String toString() {
        return "\nHealthyShop" +
                ",\t headquartersAddress = " + headquartersAddress
                + "...\n";
    }
}
