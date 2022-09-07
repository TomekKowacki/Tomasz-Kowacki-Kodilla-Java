package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
//Zadanie: pierwszy test jednostkowy
        Calculator calculator = new Calculator();
        int addResult = calculator.addAToB(14, 3);
        int subtractResult = calculator.subtractAFromB(12, 4);
    //Adding test:
        if(addResult == 14 + 3) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("ERROR");
        }
    //Subtract test:
        if(subtractResult == 4 - 12) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("ERROR");
        }
    }
}