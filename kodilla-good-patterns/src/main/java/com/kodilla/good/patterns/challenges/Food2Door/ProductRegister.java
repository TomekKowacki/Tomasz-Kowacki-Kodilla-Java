package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProductRegister {

    private List<Product> listOfProducts = new ArrayList<Product>();

    public boolean addNewProduct(Product product) {
        if (listOfProducts.contains(product)) {
            System.out.println("This producer already has such a product");
            return false;
        } else {
            listOfProducts.add(product);
            return true;
        }
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }
}
