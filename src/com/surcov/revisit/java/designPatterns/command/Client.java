package com.surcov.revisit.java.designPatterns.command;

public class Client {
    public static void main(String[] args) {
        CmdReceiver receiver =  new CmdReceiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.execute();

    }
}
