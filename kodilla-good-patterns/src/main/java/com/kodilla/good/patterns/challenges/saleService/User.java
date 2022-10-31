package com.kodilla.good.patterns.challenges.saleService;

public class User {

    private String firstName;
    private String userName;
    private int userId;
    private String userEMail;

    public User (String firstname, String userName,int userId, String userEMail){
        this.firstName = firstname;
        this.userName = userName;
        this.userId = userId;
        this.userEMail = userEMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserEMail() {
        return userEMail;
    }
}
