package com.surcov.revisit.java.designPatterns.bridge;
public class BridgeDemo {
    public static void main(String[] args) {
        SimpleAccount account = new SimpleAccount(100);
        account.withdraw(75);

        if (account.isBalanceLow()) {
            // you can also change the Logger implementation at runtime
            account.setLogger(new Warning());
        }

        account.withdraw(10);
        account.withdraw(100);
    }
}