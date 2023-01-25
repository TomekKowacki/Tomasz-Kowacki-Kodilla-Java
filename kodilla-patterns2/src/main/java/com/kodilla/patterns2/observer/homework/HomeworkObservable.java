package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {

    void registerTaskObserver(HomeworkObserver observer);
    void notifyTaskObserver();
    void removeTaskObserver(HomeworkObserver observer);
}
