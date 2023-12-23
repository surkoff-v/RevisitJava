package com.surcov.revisit.java.designPatterns.chainOfResponsibility;

public class DispencerATM {

    DispenceChain dispenceChain;

    public static void main(String ...aaa){
        DispencerATM atm = new DispencerATM();
        Dispencer50 dispencer50 = new Dispencer50();
        Dispencer20 dispencer20 = new Dispencer20();
        Dispencer10 dispencer10 = new Dispencer10();

        dispencer50.setNext(dispencer20);
        dispencer20.setNext(dispencer10);

        atm.dispenceChain = dispencer50;

        atm.dispenceChain.dispence(new Currency(180));

    }
}
