package com.surcov.revisit.java.designPatterns.visitor;



public interface Visitor {
    void visit(JsonDocument e);
    void visit(XMLDocument e);
}
