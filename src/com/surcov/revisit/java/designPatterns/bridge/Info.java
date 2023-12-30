package com.surcov.revisit.java.designPatterns.bridge;

public class Info implements Logger {
        @Override
        public void log(String message) {
            System.out.println("info: " + message);
        }
    }



