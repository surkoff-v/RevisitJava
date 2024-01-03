package com.surcov.revisit.java.designPatterns.templateMethod;

public class GlassHouseConstruction extends AbstractHouseConstruction {

    @Override
    protected void windows() {
        System.out.println("Build windows from metal and glass");
    }

    @Override
    protected void walls() {
        System.out.println("build walls from metal and glass");
    }
}
