package com.surcov.revisit.java.designPatterns.abstractFactory;

public class ServerFactory implements ComputerFactory {
    @Override
    public Ram getRam() {
        return Ram.Server;
    }

    @Override
    public Hdd getHdd() {
        return Hdd.Server;
    }
}
