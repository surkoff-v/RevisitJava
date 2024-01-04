package com.surcov.revisit.java.designPatterns.strategy;

public class Car {

    BrakingSystem brakingSystem;

    public Car(BrakingSystem brakingSystem) {
        this.brakingSystem = brakingSystem;
    }

    public void setBrakingSystem(BrakingSystem brakingSystem) {
        this.brakingSystem = brakingSystem;
    }

    void brake(){
        brakingSystem.brake();
    }

}
