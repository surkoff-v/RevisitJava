package com.surcov.revisit.java.designPatterns.command;


public class ConcreteCommand implements Command {

    CmdReceiver receiver;

    public ConcreteCommand(CmdReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
