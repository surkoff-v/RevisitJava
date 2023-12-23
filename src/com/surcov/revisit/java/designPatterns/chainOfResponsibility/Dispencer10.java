package com.surcov.revisit.java.designPatterns.chainOfResponsibility;

public class Dispencer10 implements DispenceChain {

    DispenceChain nextDispencer;

    @Override
    public void setNext(DispenceChain dispenceChain) {
        this.nextDispencer =dispenceChain;
    }

    @Override
    public void dispence(Currency currency) {
        if (currency.getAmt()>=10) {
            int num = currency.getAmt()/10;
            int rem = currency.getAmt()%10;
            System.out.println(String.format("dispencing %s of 10$",num));
            if (rem!=0) {
                nextDispencer.dispence(new Currency(rem));
            }
        } else {
            nextDispencer.dispence(currency);
        }
    }
}
