package com.surcov.revisit.java.designPatterns.state;

public class CoinInsertedState implements State {
    @Override
    public void insertCoin(VendingMashine vm) {
        System.out.println("Coin is already inserted");
    }

    @Override
    public void pushDispense(VendingMashine vm) throws InterruptedException {
        vm.hasCoin = false;
        vm.setCoinsCnt(vm.getCoinsCnt()+1);
        vm.setState(State.dispensingState);
        System.out.println("Dispensing...wait");
        Thread.sleep(500);
        if (vm.isEmpty()){
            vm.setState(State.emptyState);
            return;
        }
        if (vm.hasCoin){
            vm.setState(State.coinInsertedState);
        } else {
            vm.setState(State.noCoinInsertedState);
        }
    }
}
