package com.surcov.revisit.java.designPatterns.observer;

public interface Observable1 {
    void addObserver(Observer1 observer1);

    void removeObserver(Observer1 observer1);

    void notify(String news);
}
