package com.surcov.revisit.java.designPatterns.visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Document document = new Document();
        document.addElement(new JsonDocument("{a:1}"));
        document.addElement(new XMLDocument("<node>1</node>"));
        document.addElement(new JsonDocument("{a:2}"));
        document.addElement(new XMLDocument("<node>2</node>"));
        document.accept(new ElementVisitor());

    }
}
