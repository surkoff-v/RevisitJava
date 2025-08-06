package com.surcov.revisit.java.designPatterns.decorator;

public class ConcreteDecoratorC extends Decorator {

    public ConcreteDecoratorC(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("I add some C behavior");
    }
}
