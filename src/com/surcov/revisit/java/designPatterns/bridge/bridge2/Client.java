package com.surcov.revisit.java.designPatterns.bridge.bridge2;

public class Client {
    public static void main(String[] args) {
        Abstraction redCircle = new RefinedAbstraction(100,100, 10, new ConcreteImplementerA());
        Abstraction greenCircle = new RefinedAbstraction(100,100, 10, new ConcreteImplementerB());

        redCircle.draw();
        greenCircle.draw();
    }
}