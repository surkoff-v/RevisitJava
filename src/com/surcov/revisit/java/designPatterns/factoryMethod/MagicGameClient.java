package com.surcov.revisit.java.designPatterns.factoryMethod;

public class MagicGameClient {
    public static void main(String ...ar){
        AbstractMazeGame game = new ConcretMazeGame();
        game.getRooms().stream().forEach(Room::hi);
    }
}
