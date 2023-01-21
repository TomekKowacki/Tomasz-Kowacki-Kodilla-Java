package com.kodilla.hibernate.manytomany.facade;

public class ManyToManyException extends Exception{

    public static String ERR_COMPANY_NOT_FOUND = "Company does not exist";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee does not exist";

    public ManyToManyException(String message) {
        super(message);
    }
}
