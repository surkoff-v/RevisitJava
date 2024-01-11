package com.surcov.revisit.java.designPatterns.bridge.bridge2;

public class ConcreteImplementerA implements Implementer {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}