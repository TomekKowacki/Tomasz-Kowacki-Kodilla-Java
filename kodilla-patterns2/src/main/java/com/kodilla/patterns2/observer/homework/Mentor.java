package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver{

    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(username + " you have new task to check in " + homework.getName() +
                "\n\tTotal tasks in queue: " + homework.getTasks().size());
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
