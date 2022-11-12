package com.kodilla.patterns.factory.task;

public class PaintingTask implements Task {

    private String taskName;
    private String colour;
    private String whatToPaint;
    private boolean isDone;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (!isDone) {
            System.out.println("[ " +taskName+ " ]" + " is now executing");
            isDone = true;
        }
    }

    @Override
    public String getTaskName () {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted () {
        return isDone;
    }
}
