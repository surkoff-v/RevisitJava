package com.surcov.revisit.java.designPatterns.iterator;

public class IteratorClinet {
    public static void main(String[] args) {
        ConcreteIterator concreteIterator = new ConcreteIterator(new ConcreteIterable());

        while (concreteIterator.hasNext()) {
            System.out.println(concreteIterator.next());
        }

    }
}
