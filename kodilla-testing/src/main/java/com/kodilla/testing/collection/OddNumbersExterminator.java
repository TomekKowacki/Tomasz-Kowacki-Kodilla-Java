package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate (List<Integer> numbers) {
        int temporaryNumber = 0;
        List<Integer> evenNumbers = new ArrayList<>();
        for(int n=0; n< numbers.size(); n++) {
            temporaryNumber = numbers.get(n);
            if (temporaryNumber % 2 == 0) {
                evenNumbers.add(temporaryNumber);
            }
        }
        return evenNumbers;

    }
}
