package com.surcov.revisit.java.designPatterns.chainOfResponsibility;

public class Currency {

    public Currency(int amt) {
        this.amt = amt;
    }

    int amt;

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public int getAmt() {
        return amt;
    }
}
