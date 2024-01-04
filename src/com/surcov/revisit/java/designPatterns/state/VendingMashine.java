package com.surcov.revisit.java.designPatterns.state;

public class VendingMashine {

    private int coinsCnt;

    private State state;

    protected boolean hasCoin;

    protected boolean isEmpty;

    public void insertCoin(){
        this.getState().insertCoin(this);
    }

    public void pushDispense() throws InterruptedException {
        this.getState().pushDispense(this);
    }

    public VendingMashine() {
        this.coinsCnt = 0;
        this.state = State.noCoinInsertedState;
        this.hasCoin = false;
        this.isEmpty = false;
    }

    protected State getState() {
        return state;
    }

    protected void setState(State state) {
        System.out.printf("Changing state to %s",state.getClass().getSimpleName());
        System.out.println();
        this.state = state;
    }

    protected int getCoinsCnt() {
        return coinsCnt;
    }

    protected void setCoinsCnt(int coinsCnt) {
        this.coinsCnt = coinsCnt;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
