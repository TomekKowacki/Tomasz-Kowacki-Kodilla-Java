package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testUpdate(){
        //Given
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");

        Homework frontEndDev = new FrontEndDev();
        Homework fullStackDev = new FullStackDev();
        Homework javaDev = new JavaDev();
        Homework javaDevPlus = new JavaDevPlus();

        frontEndDev.registerTaskObserver(mentor2);
        fullStackDev.registerTaskObserver(mentor2);
        javaDev.registerTaskObserver(mentor1);
        javaDevPlus.registerTaskObserver(mentor1);

        //When
        frontEndDev.addTask("Front 1");
        frontEndDev.addTask("Front 2");
        fullStackDev.addTask("Full 1");
        fullStackDev.addTask("Full 2");
        javaDevPlus.addTask("Java Plus 1");
        javaDev.addTask("Java 1");

        //Then
        assertEquals(2,mentor1.getUpdateCount());
        assertEquals(4, mentor2.getUpdateCount());

    }
}
