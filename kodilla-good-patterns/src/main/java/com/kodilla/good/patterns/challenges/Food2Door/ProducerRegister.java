package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ProducerRegister {

    Map<ProducerProcess, ProductRegister> registerProducers = new HashMap<ProducerProcess, ProductRegister>();

    public void addNewProducer(ProducerProcess producer, ProductRegister productRegister) {
        registerProducers.put(producer, productRegister);
    }

    public void showAllAvailableProducts() {
        for (Map.Entry<ProducerProcess, ProductRegister> current : registerProducers.entrySet()) {
            System.out.println(current.getKey());
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.getQuantity() > 0)
                    System.out.println(currentProduct.toString());
            }
        }
    }

    public boolean isAvailableProduct(Product product, int volumeOfPurchase) {
        for (Map.Entry<ProducerProcess, ProductRegister> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.equals(product) && currentProduct.getQuantity() > volumeOfPurchase) {
                    product.setQuantityAfterSale(volumeOfPurchase);
                    return true;
                }
            }
        }
        return false;
    }

    public ProducerProcess getProducerOfSpecyficProduct(Product product) {
        for (Map.Entry<ProducerProcess, ProductRegister> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getListOfProducts()) {
                if (currentProduct.equals(product)) {
                    return current.getKey();
                }
            }
        }
        return null;
    }
}
