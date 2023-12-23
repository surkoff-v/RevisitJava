package com.surcov.revisit.java.designPatterns.mediator.example;

public abstract class User {

    protected Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
