package com.surcov.revisit.java.designPatterns.mediator.example;

public class ChatClient {

    public static void main(String ...arg){
        Mediator m = new MediatorImpl();
        User u1 = new UserImpl(m);
        User u2 = new UserImpl(m);
        User u3 = new UserImpl(m);
        User u4 = new UserImpl(m);
        User u5 = new UserImpl(m);

        m.addUser(u1);
        m.addUser(u2);
        m.addUser(u3);
        m.addUser(u4);
        m.addUser(u5);

        u1.send("Hi All");

    }

}
