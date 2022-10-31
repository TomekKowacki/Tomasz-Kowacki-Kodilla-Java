package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;

public class DataRetriever {

    public void retrieve () {

        ProducerProcess producerExtraFoodShopProducer = new ExtraFoodShop("ExtraFoodShop",
                "Kraków ul. Zalesie 3");
        ProducerProcess producerHealthyShop = new HealthyShop("HealthyShop",
                "Kraków ul. Modrzewiowa 43");
        ProducerProcess producerGlutenFreeShop = new GlutenFreeShop("GlutenFreeShop",
                "Kraków ul. Za zakrętem 4");

        Product product = new Product("Mleko", 35, 3.45);
        Product product1 = new Product("Maślanka",35, 2.89);
        Product product2 = new Product("Ser Gouda", 15, 8.99);
        Product product3 = new Product("Masło",40, 8.49);
        Product product4 = new Product("Twaróg", 61, 5.49);
        Product product5 = new Product("Kefir", 32, 3.99);
        Product product6 = new Product("Maślanka Jagodowa", 35, 2.99);
        Product product7 = new Product("Chleb", 50, 7.50 );
        Product product8 = new Product("Bółka wieloziarnista", 50, 1.50);
        Product product9 = new Product("Zestaw warzyw obiadowych", 35, 10.99);
        Product product10 = new Product("Szynka podsuszana", 24, 25.99);
        Product product11 = new Product("Jabłka", 20, 3.5);
        Product product12 = new Product("Gruszki", 40, 5.29);

        ProductRegister productsOfExtraFoodShop = new ProductRegister();
        ProductRegister productsOfHealthyShop = new ProductRegister();
        ProductRegister productsOfGlutenFreeShop = new ProductRegister();

        productsOfExtraFoodShop.addNewProduct(product);
        productsOfExtraFoodShop.addNewProduct(product1);
        productsOfExtraFoodShop.addNewProduct(product2);
        productsOfExtraFoodShop.addNewProduct(product3);
        productsOfExtraFoodShop.addNewProduct(product4);
        productsOfExtraFoodShop.addNewProduct(product5);

        productsOfHealthyShop.addNewProduct(product6);
        productsOfHealthyShop.addNewProduct(product9);
        productsOfHealthyShop.addNewProduct(product11);
        productsOfHealthyShop.addNewProduct(product12);

        productsOfGlutenFreeShop.addNewProduct(product7);
        productsOfGlutenFreeShop.addNewProduct(product10);
        productsOfGlutenFreeShop.addNewProduct(product8);

        ProducerRegister producerRegister = new ProducerRegister();

        producerRegister.addNewProducer(producerExtraFoodShopProducer, productsOfExtraFoodShop);
        producerRegister.addNewProducer(producerHealthyShop, productsOfHealthyShop);
        producerRegister.addNewProducer(producerGlutenFreeShop, productsOfGlutenFreeShop);


        Order order = new Order(product7, 5,
                        new User("Tomasz", "Jakis", "baloooon",
                                "Kokoszki 23/4", "baloooon@gmail.com"),
                    LocalDate.of(2017, 10, 15));

        Processor processor = new Processor(new EMailInformation(), producerRegister);
        processor.process(order);
    }
}
