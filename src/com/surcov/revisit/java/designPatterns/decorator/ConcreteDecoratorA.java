package com.surcov.revisit.java.designPatterns.decorator;

public class ConcreteDecoratorA extends Decorator {

    private int state;

    public ConcreteDecoratorA(Component component, int state) {
        super(component);
        this.state = state;
    }

    @Override
    public void execute() {
        super.execute();
        System.out.printf("I have added state %s",state);
    }
}
