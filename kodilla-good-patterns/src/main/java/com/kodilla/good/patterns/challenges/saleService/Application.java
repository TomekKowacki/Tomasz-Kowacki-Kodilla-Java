package com.kodilla.good.patterns.challenges.saleService;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        Processor processor = new Processor(new EmailInformationService(),
                new FoilSalesService(), new SalesDatabase());

        processor.process(order);
    }
}
