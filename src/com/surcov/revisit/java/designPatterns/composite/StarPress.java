package com.surcov.revisit.java.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class StarPress extends Machine {

    List<MachineComposite> composites;

    public StarPress(int cnt) {
        this.composites = new ArrayList<>(cnt);
    }
}
