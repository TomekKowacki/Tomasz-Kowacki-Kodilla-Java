package com.kodilla.good.patterns.challenges.Food2Door;

public class Processor {

    private SalesInformation salesInformation;
    private ProducerRegister producerRegister;

    public Processor(SalesInformation salesInformation, ProducerRegister registerProducers) {
        this.salesInformation = salesInformation;
        this.producerRegister = registerProducers;
    }

    public ProducerProcess getProducerOfProduct(Product product) {
        return producerRegister.getProducerOfSpecyficProduct(product);
    }

    public void process(Order order) {

        producerRegister.showAllAvailableProducts();
        boolean isAvailable = producerRegister.isAvailableProduct(order.getProduct(), order.getVolumeOfPurchase());
        getProducerOfProduct(order.getProduct()).process(order.getProduct(), order.getVolumeOfPurchase());
        salesInformation.information(order, isAvailable);
        if (!isAvailable) {
            System.out.println("Order cannot be processed");
        }
    }
}
