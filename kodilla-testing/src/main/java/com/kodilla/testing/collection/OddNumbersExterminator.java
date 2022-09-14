package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> evenNumber = new ArrayList<>();

    public List<Integer> exterminate (List<Integer> numbers) {
        int temporaryNumber = 0;

        for(int n=0; n< numbers.size(); n++) {
            temporaryNumber = numbers.get(n);
            if (temporaryNumber % 2 == 0) {
                evenNumber.add(temporaryNumber);
            }
        }
        return evenNumber;

    }
}
