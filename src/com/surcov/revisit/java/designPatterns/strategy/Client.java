package com.surcov.revisit.java.designPatterns.strategy;

public class Client {
    public static void main(String[] args) {
        Car car = new Car(new BrakeWithABS());
        car.brake();
        car.setBrakingSystem(new BrakeWithoutABS());
        car.brake();
    }
}
