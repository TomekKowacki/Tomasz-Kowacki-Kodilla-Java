package com.kodilla.good.patterns.challenges.Food2Door;

public class EMailInformation implements SalesInformation{
    @Override
    public void information(Order order, boolean isSold) {

        if (isSold) {
            System.out.println(order.getUser().getName() + " " + order.getUser().getLastname()
                    + " Your order is processing"
                    + "\nordered products: " + order.getProduct().getProductName() + " price: " + order.getProduct().getPrice() + "PLN"
                    + "\nQuantity: " + order.getVolumeOfPurchase()
                    + "\nDelivery address: " + order.getUser().getDeliveryAddress()
                    + "\nConfirmation sent to: " + order.getUser().geteMail()
                    + "\nDate of order " + order.getDateOfSale());

        } else {
            System.out.println(order.getUser().getName() + " " + order.getUser().getLastname()
                    + " Your order cannot be proccessed.\nOrdered products: "
                    + order.getProduct().getProductName() + " are unavailable.");
        }
    }
}
