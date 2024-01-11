package com.surcov.revisit.java.designPatterns.bridge.bridge2;

public class ConcreteImplementerB implements Implementer {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}