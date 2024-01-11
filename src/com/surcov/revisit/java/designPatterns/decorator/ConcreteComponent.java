package com.surcov.revisit.java.designPatterns.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void execute() {
        System.out.println("This is my default behavior");
    }
}
