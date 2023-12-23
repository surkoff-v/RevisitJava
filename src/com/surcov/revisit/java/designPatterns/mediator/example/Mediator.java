package com.surcov.revisit.java.designPatterns.mediator.example;

public interface Mediator {


    void send(String msg, User u);

    void addUser(User u);
}
