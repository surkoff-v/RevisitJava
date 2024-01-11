package com.surcov.revisit.java.designPatterns.decorator;

public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        component.execute();
    }
}
