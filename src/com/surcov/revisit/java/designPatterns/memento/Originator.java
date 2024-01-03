package com.surcov.revisit.java.designPatterns.memento;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento getMemento() {
        var memento = new Memento(state);
        return memento;
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }


}
