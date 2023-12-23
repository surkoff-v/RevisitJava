package com.surcov.revisit.java.designPatterns.mediator.example;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

    List<User> users;

    public MediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void send(String msg,User u) {
        users.stream().filter(us->us!=u).forEach(us->us.receive(msg));
    }

    @Override
    public void addUser(User u) {
        users.add(u);
    }
}
