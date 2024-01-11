package com.surcov.revisit.java.designPatterns.bridge.bridge2;

public class RefinedAbstraction extends Abstraction {
    private int x, y, radius;

    public RefinedAbstraction(int x, int y, int radius, Implementer implementer) {
        super(implementer);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        implementer.drawCircle(radius,x,y);
    }
}