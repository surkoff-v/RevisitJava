package com.surcov.revisit.java.designPatterns.state.clinet;

import com.surcov.revisit.java.designPatterns.state.VendingMashine;

public class VendingMashineClinet {
    public static void main(String[] args) throws InterruptedException {
        VendingMashine vm = new VendingMashine();
        vm.insertCoin();
        vm.pushDispense();
    }
}
