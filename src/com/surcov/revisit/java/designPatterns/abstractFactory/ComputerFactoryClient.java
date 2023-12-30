package com.surcov.revisit.java.designPatterns.abstractFactory;

public class ComputerFactoryClient {

    public static void main(String ...arg){
        ComputerFactory computerFactory = new ServerFactory();

        Ram ram = computerFactory.getRam();
        Hdd hdd = computerFactory.getHdd();

    }
}
