package com.surcov.revisit.java.designPatterns.templateMethod;

public class WoodHouseConstruction extends AbstractHouseConstruction {
    @Override
    protected void windows() {
        System.out.println("Build windows from wood and glass");
    }

    @Override
    protected void walls() {
        System.out.println("Build windows from wood");
    }
}
