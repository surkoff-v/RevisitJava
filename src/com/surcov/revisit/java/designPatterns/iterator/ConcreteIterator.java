package com.surcov.revisit.java.designPatterns.iterator;

public class ConcreteIterator implements IteratorExample {

    ConcreteIterable iterable;

    private int currentIndex = -1;

    @Override
    public boolean hasNext() {
        return currentIndex < iterable.getArr().length-1;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return iterable.arr[++currentIndex];
        } else {
            return null;
        }
    }

    public ConcreteIterator(ConcreteIterable iterableExample) {
        iterable = iterableExample;
    }
}
