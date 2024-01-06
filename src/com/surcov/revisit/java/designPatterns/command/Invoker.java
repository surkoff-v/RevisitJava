package com.surcov.revisit.java.designPatterns.command;

public class Invoker {

    Command command;

    public  Invoker(Command command) {
        this.command = command;
    }

    void execute(){
        command.execute();
    }
}
