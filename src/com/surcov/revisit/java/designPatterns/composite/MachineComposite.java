package com.surcov.revisit.java.designPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class MachineComposite implements MashineComponent {

    List<MashineComponent> composites;

    public MachineComposite(int cnt) {
        composites = new ArrayList<>(cnt);
    }

    public void add(MashineComponent c){
        composites.add(c);
    }

    @Override
    public int getMachineCount() {
        Integer reduce = composites.stream().mapToInt(c -> c.getMachineCount()).sum();
        return reduce;
    }
}
