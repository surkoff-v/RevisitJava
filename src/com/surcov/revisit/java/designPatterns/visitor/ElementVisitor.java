package com.surcov.revisit.java.designPatterns.visitor;

public class ElementVisitor implements Visitor {
    @Override
    public void visit(JsonDocument e) {
        System.out.printf("Print JSON: %s",e.getJSONContent());
        System.out.println();
    }

    @Override
    public void visit(XMLDocument e) {
        System.out.printf("Print XML: %s",e.getXMLContent());
        System.out.println();
    }
}
