package com.surcov.revisit.java.designPatterns.observer;

public class ConcreteObserver implements Observer1 {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println(news);
    }

    public String getNews() {
        return news;
    }

    // standard getter and setter
}