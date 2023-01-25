package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable {

    private final List<String> tasks;
    private final List<HomeworkObserver> observers;
    private String name;


    public Homework(String name) {
        this.name = name;
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    @Override
    public void registerTaskObserver(HomeworkObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyTaskObserver() {
        for (HomeworkObserver homeworkObserver : observers){
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeTaskObserver(HomeworkObserver observer) {
        observers.remove(observer);
    }

    public void addTask(String name){
        tasks.add(name);
        notifyTaskObserver();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
