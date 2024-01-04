package com.surcov.revisit.java.designPatterns.strategy;

public class BrakeWithABS implements BrakingSystem {
    @Override
    public void brake() {
        System.out.println("Braking with ABS");
    }
}
