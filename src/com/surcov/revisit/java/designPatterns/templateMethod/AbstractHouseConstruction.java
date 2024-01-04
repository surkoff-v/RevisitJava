package com.surcov.revisit.java.designPatterns.templateMethod;

public abstract class AbstractHouseConstruction {

    public final void build(){
        foundation();
        walls();
        windows();
    }

    protected abstract void windows();

    protected abstract void walls();

    private void foundation() {
        System.out.println("build foundation");
    }
}
