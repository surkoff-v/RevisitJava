package com.surcov.revisit.java.designPatterns.prototype;

import java.util.Arrays;

public class ProtoClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.load();
        Employees employees1 = (Employees)employees.clone();
        System.out.println(employees1.getEmplList());
    }

}
