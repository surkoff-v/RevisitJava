package com.surcov.revisit.java.designPatterns.mediator;


interface RocketSim {
    double getMass();
    double getThrust();
    void setSimTime(double t);
}

public class PysicalRocket {
    double burnArea;
    double burnRate;
    double fuelMass;
    double totalMass;

    public PysicalRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        this.burnArea = burnArea;
        this.burnRate = burnRate;
        this.fuelMass = fuelMass;
        this.totalMass = totalMass;
    }

    public double getBurnRate() {
        return 0.0;
    }

    public double getMass(double t) {
        return 10*t;
    }

    public double getThrust(double t){
        return 5*t;
    }
}

class OozinozRocket extends PysicalRocket implements RocketSim  {

    private double time;

    public OozinozRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    @Override
    public void setSimTime(double t) {
        this.time = t;
    }

    @Override
    public double getMass() {
        return getMass(time);
    }

    @Override
    public double getThrust() {
        return super.getThrust(time);
    }
}
