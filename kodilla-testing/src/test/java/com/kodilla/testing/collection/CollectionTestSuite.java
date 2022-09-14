package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: BEGIN");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: END");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: BEGIN");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: END");
    }

    @DisplayName("when the list of numbers is empty, " +
            "then the evenNumber list should be empty"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers1 = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> evenNumber = oddNumbersExterminator.exterminate(numbers1);
        numbers1.clear();
        if (numbers1.isEmpty()) System.out.println("testing exterminating odd numbers from empty list");
        //Then
        Assertions.assertEquals(0, evenNumber.size());
    }

    @DisplayName("when the list of numbers is normal, " +
            "then the evenNumber list should contain even numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers2 = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        Random theGenerator = new Random();
        for (int i = 0; i < 500; i++) {
            numbers2.add(theGenerator.nextInt(1000));
        }
        //When
        List<Integer> evenNumber = oddNumbersExterminator.exterminate(numbers2);
        //oddNumbersExterminator.exterminate(numbers2);
        if (!numbers2.isEmpty()) System.out.println("testing exterminating odd numbers from normal list");
        //Then
        for(int i=0; i< test.size(); i++) {
            Assertions.assertEquals(0, evenNumber.get(i) % 2);
        }
    }

}
