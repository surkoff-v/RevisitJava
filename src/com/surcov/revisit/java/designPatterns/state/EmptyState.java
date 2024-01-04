package com.surcov.revisit.java.designPatterns.state;

public class EmptyState implements State {
    @Override
    public void insertCoin(VendingMashine vm) {
        System.out.println("Refill is needed");
    }

    @Override
    public void pushDispense(VendingMashine vm) {
        System.out.println("Refill is needed");
    }
}
