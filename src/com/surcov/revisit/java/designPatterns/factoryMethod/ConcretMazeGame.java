package com.surcov.revisit.java.designPatterns.factoryMethod;

public class ConcretMazeGame extends AbstractMazeGame {
    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
