package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {
    @Test
    void whenTheValuesAreCorrect() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1.3));
    }
    @Test
    void whenTheValuesAreIncorrect(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.2, 1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.2, 1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
    }
}
