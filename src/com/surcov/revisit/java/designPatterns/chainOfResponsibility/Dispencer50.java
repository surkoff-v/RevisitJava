package com.surcov.revisit.java.designPatterns.chainOfResponsibility;

public class Dispencer50 implements DispenceChain {

    DispenceChain nextDispencer;

    @Override
    public void setNext(DispenceChain dispenceChain) {
        this.nextDispencer =dispenceChain;
    }

    @Override
    public void dispence(Currency currency) {
        if (currency.getAmt()>=50) {
            int num = currency.getAmt()/50;
            int rem = currency.getAmt()%50;
            System.out.println(String.format("dispencing %s of 50$",num));
            if (rem!=0) {
                nextDispencer.dispence(new Currency(rem));
            }
        } else {
            nextDispencer.dispence(currency);
        }
    }
}
