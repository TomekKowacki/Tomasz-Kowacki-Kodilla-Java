package com.kodilla.patterns.factory.task;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING_TASK";
    public static final String PAINTING = "PAINTING_TASK";
    public static final String DRIVING = "DRIVING_TASK";

    public final Task makeTask(final String newTask){
        return switch (newTask) {
            case SHOPPING -> new ShoppingTask("Buy dinner", "Soup", 4.0);
            case PAINTING -> new PaintingTask("Paint Living-room", "Bronze", "Walls");
            case DRIVING ->  new DrivingTask("Pick up the kids", "School", "Car");
            default -> throw new IllegalArgumentException("Choosen name of task is wrong!");
        };
    }
}
