package com.surcov.revisit.java.designPatterns.state;

public interface State {

    State coinInsertedState = new CoinInsertedState();
    State noCoinInsertedState = new NoCoinInsertedState();
    State emptyState = new EmptyState();
    State dispensingState = new DispensingState();

    void insertCoin(VendingMashine vm);
    void pushDispense(VendingMashine vm) throws InterruptedException;

}
