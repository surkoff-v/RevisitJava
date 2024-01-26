package com.surcov.revisit.java.designPatterns.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        ConcreteObserver observer1 = new ConcreteObserver();
        Observable1 observable1 = new ConcreteObservable();
        observable1.addObserver(observer1);
        observer1.update("gggg");

    }

}
