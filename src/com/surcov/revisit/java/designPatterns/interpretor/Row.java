package com.surcov.revisit.java.designPatterns.interpretor;

class Row {

    private String name;
    private String surname;

    Row(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}