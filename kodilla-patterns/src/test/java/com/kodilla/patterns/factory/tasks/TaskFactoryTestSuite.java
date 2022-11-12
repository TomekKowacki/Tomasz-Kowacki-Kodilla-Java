package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.task.Task;
import com.kodilla.patterns.factory.task.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        boolean isDoneBeforeExecute = shopping.isTaskExecuted();
        shopping.executeTask();

        //Then
        assertFalse(isDoneBeforeExecute);
        assertEquals("Buy dinner", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        boolean isDoneBeforeExecute = driving.isTaskExecuted();
        driving.executeTask();

        //Then
        assertFalse(isDoneBeforeExecute);
        assertEquals("Pick up the kids", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        boolean isDoneBeforeExecute = painting.isTaskExecuted();
        painting.executeTask();

        //Then
        assertFalse(isDoneBeforeExecute);
        assertEquals("Paint Living-room", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

}
