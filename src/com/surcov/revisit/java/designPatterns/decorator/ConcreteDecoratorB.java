package com.surcov.revisit.java.designPatterns.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("I add some behavior");
    }
}
