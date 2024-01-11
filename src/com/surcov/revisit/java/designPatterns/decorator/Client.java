package com.surcov.revisit.java.designPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()),10);
        component.execute();
    }
}
