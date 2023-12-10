package com.surcov.revisit.java.designPatterns.mediator;

public class Rocket {

    public Rocket(String name, double price, double apogee) {
        this.name = name;
        this.price = price;
        this.apogee = apogee;
    }

    String name;
    double price;
    double apogee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getApogee() {
        return apogee;
    }

    public void setApogee(double apogee) {
        this.apogee = apogee;
    }
}
