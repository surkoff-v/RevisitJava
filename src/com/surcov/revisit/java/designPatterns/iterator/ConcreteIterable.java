package com.surcov.revisit.java.designPatterns.iterator;

public class ConcreteIterable implements IterableExample {

    String[] arr = {"John","Bill","Terry","Bob"};

    @Override
    public IteratorExample iterator() {
        return new ConcreteIterator(this);
    }

    public String[] getArr() {
        return arr;
    }

}
