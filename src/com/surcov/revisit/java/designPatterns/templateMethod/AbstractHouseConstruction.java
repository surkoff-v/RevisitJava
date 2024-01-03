package com.surcov.revisit.java.designPatterns.templateMethod;

public abstract class AbstractHouseConstruction {

    public final void bild(){
        fundation();
        walls();
        windows();
    }

    protected abstract void windows();

    protected abstract void walls();

    private void fundation() {
        System.out.println("build fundation");
    }
}
