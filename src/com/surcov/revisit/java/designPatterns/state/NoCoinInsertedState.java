package com.surcov.revisit.java.designPatterns.state;

public class NoCoinInsertedState implements State{
    @Override
    public void insertCoin(VendingMashine vm) {
        vm.hasCoin = true;
        vm.setState(State.coinInsertedState);
    }

    @Override
    public void pushDispense(VendingMashine vm) {
        System.out.println("Insert coin please");
    }
}
