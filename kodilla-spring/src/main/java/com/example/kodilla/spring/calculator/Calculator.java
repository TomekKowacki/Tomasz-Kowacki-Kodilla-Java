package com.example.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display){
        this.display = display;
    }

    public double add(double a, double b){
        double val = a+b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b){
        double val = a-b;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b){
        double val = a*b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b){
        double val = a/b;
        display.displayValue(val);
        return val;
    }
}
