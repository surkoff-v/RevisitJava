package com.surcov.revisit.java.designPatterns.strategy;

public class BrakeWithoutABS implements BrakingSystem {
    @Override
    public void brake() {
        System.out.println("Bracking without ABS");
    }
}
