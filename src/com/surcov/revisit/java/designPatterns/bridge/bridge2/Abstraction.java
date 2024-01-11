package com.surcov.revisit.java.designPatterns.bridge.bridge2;

public abstract class Abstraction {
    protected Implementer implementer;

    protected Abstraction(Implementer implementer){
        this.implementer = implementer;
    }
    public abstract void draw();
}