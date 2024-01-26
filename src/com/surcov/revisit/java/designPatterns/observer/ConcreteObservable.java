package com.surcov.revisit.java.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;


public class ConcreteObservable implements Observable1 {
    private String news;
    private List<Observer1> observer1s = new ArrayList<>();

    @Override
    public void addObserver(Observer1 observer1) {
        this.observer1s.add(observer1);
    }

    @Override
    public void removeObserver(Observer1 observer1) {
        this.observer1s.remove(observer1);
    }

    @Override
    public void notify(String news) {
        this.news = news;
        for (Observer1 observer1 : this.observer1s) {
            observer1.update(this.getNews());
        }
    }

    public String getNews() {
        return news;
    }
}
