package com.surcov.revisit.java.designPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    public static void main(String[] args) {
        List<Memento> mementoList = new ArrayList<>();
        var originator = new Originator("State1");
        mementoList.add(originator.getMemento());
        originator.setState("State2");
        System.out.println(originator.getState());
        originator.restoreMemento(mementoList.get(0));
        System.out.println(originator.getState());
    }

}
