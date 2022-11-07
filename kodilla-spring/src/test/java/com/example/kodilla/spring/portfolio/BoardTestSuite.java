package com.example.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.example.kodilla.spring.portfolio");

        //When
        Board board = (Board)context.getBean("getBoard");

        ArrayList<String> taskToDoList = (ArrayList)board.getToDoList().getTasksList();
        taskToDoList.add("First task");

        ArrayList<String> taskInProgressList = (ArrayList)board.getInProgressList().getTasksList();
        taskInProgressList.add("Second task");

        ArrayList<String> taskDoneList = (ArrayList)board.getDoneList().getTasksList();
        taskDoneList.add("Third task");

        //Then
        assertEquals("First task", taskToDoList.get(0));
        assertEquals("Second task", taskInProgressList.get(0));
        assertEquals("Third task", taskDoneList.get(0));

    }

}
