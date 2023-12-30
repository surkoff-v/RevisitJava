package com.surcov.revisit.java.designPatterns.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMazeGame {

    protected List<Room> rooms;

    public AbstractMazeGame() {
        rooms = new ArrayList<>();
        Room room1 = makeRoom();
        rooms.add(room1);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    protected abstract Room makeRoom();
}
