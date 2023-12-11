package com.surcov.revisit.java.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Mixer extends Machine {

    List<MashineComponent> mashineComponents;

    public Mixer(int cnt) {
        this.mashineComponents = new ArrayList<>(cnt);
    }

    @Override
    public int getMachineCount() {
        return 0;
    }
}
