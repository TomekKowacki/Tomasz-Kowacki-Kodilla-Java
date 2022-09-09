package com.kodilla.testing.forum.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
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
        //When
        if (numbers1.isEmpty()) System.out.println("testing exterminating odd numbers from empty list");
        //Then
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numbers1);
    }

    @DisplayName("when the list of numbers is normal, " +
            "then the evenNumber list should contain even numbers"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers2 = new ArrayList<>();
        Random theGenerator = new Random();
        for (int i = 0; i < 500; i++) {
            numbers2.add(theGenerator.nextInt(1000));
        }
        //When
        if (!numbers2.isEmpty()) System.out.println("testing exterminating odd numbers from normal list");
        //Then
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numbers2);
    }
}
