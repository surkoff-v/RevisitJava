package com.surcov.revisit.java.designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component componentC = new ConcreteDecoratorC(component);
        Component componentB = new ConcreteDecoratorB(componentC);
        Component componentA = new ConcreteDecoratorA(componentB, 10);
        componentA.execute();
    }
}
