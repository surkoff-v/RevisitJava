package com.surcov.revisit.java.designPatterns.visitor;

public class XMLDocument implements Element {

    private String XMLContent;

    public XMLDocument(String XMLContent) {
        this.XMLContent = XMLContent;
    }

    public String getXMLContent() {
        return XMLContent;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
