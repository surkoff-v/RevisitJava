package com.surcov.revisit.java.designPatterns.mediator.example;

public class UserImpl extends User {

    public UserImpl(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(msg);
    }
}
