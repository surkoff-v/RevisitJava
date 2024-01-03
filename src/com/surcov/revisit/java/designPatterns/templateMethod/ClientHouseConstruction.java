package com.surcov.revisit.java.designPatterns.templateMethod;

public class ClientHouseConstruction {
    public static void main(String[] args) {
        AbstractHouseConstruction woodHouseConstruction = new WoodHouseConstruction();
        woodHouseConstruction.bild();
        System.out.println();
        AbstractHouseConstruction glassHouseConstruction = new GlassHouseConstruction();
        glassHouseConstruction.bild();

    }

}
