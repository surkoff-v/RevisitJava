package com.surcov.revisit.java.designPatterns.bridge;

public class Warning implements Logger {
    @Override
    public void log(String message) {
        System.out.println("warn: " + message);
    }
}



