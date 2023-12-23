package com.surcov.revisit.java.designPatterns.chainOfResponsibility;

public interface DispenceChain {

    void setNext(DispenceChain dispenceChain);

    void dispence(Currency currency);

}
