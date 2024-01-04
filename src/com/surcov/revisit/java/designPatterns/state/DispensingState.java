package com.surcov.revisit.java.designPatterns.state;

public class DispensingState implements State{

    @Override
    public void insertCoin(VendingMashine vm) {
        if (vm.isEmpty) {
            vm.setState(State.emptyState);
        }
        vm.hasCoin = true;
    }

    @Override
    public void pushDispense(VendingMashine vm) {
        System.out.println("Wait...until dispensing end");
    }
}
