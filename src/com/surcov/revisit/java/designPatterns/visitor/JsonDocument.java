package com.surcov.revisit.java.designPatterns.visitor;

public class JsonDocument implements Element {

    private String JSONContent;

    public JsonDocument(String JSONContent) {
        this.JSONContent = JSONContent;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getJSONContent() {
        return JSONContent;
    }
}
