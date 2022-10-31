package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements ProducerProcess {

    private String name;
    private String headquartersAddress;

    public ExtraFoodShop(String name, String headquartersAddress) {
        this.name = name;
        this.headquartersAddress = headquartersAddress;
    }
    @Override
    public void process(Product getProduct, int volumeOfPurchase) {
        System.out.println("\nYour order is being prepared for shipment");
    }

    @Override
    public String toString() {
        return "\nExtraFoodShop" +
                ",\t headquartersAddress = " + headquartersAddress
                + "...\n";
    }
}
