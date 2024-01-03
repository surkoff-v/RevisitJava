package com.surcov.revisit.java.designPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    List<String> emplList = new ArrayList<>();

    public void load(){
        emplList.add("John");
        emplList.add("Jack");
        emplList.add("Ben");
    }

    public List<String> getEmplList() {
        return emplList;
    }

    public void setEmplList(List<String> emplList) {
        this.emplList = emplList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        var employees = new Employees();

        List<String> newEmplList = employees.getEmplList();
        for (var e : emplList){
            newEmplList.add(e);
        }
        return employees;
    }
}
