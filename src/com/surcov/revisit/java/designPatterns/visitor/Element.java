package com.surcov.revisit.java.designPatterns.visitor;

public interface Element {
    void accept(Visitor v);
}
