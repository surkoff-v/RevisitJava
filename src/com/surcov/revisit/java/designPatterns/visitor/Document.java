package com.surcov.revisit.java.designPatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document implements Element{
    List<Element> elements = new ArrayList<>();

    @Override
    public void accept(Visitor v) {
        elements.stream().forEach(e->e.accept(v));
    }

    public void addElement(Element e){
        elements.add(e);
    }
}
