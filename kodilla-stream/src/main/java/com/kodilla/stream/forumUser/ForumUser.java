package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postQuantity;

    public ForumUser(final int userID, final String userName, final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postQuantity) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postQuantity = postQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "User ID = " + userID +
                ", User Name = '" + userName + '\'' +
                ", Sex = " + sex +
                ", Birth Date = " + birthDate +
                ", Number of posts = " + postQuantity +
                '}';
    }
}
