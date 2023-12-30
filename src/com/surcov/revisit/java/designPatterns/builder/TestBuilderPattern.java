package com.surcov.revisit.java.designPatterns.builder;

import java.util.*;

public class TestBuilderPattern {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        List ls = new ArrayList<>();
        Iterator iterator = ls.iterator();
        Object o = new Object();

        HashMap<String ,String> hm = new HashMap<>();
        hm.clone();

    }

}