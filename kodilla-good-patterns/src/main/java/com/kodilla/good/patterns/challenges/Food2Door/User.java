package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.PrimitiveIterator;

public class User {

    private String name;
    private String lastname;
    private String userName;
    private String deliveryAddress;
    private String eMail;

    public User(String name, String lastname, String userName, String deliveryAddress, String eMail) {
        this.name = name;
        this.lastname = lastname;
        this.userName = userName;
        this.deliveryAddress = deliveryAddress;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String geteMail() {
        return eMail;
    }
}
