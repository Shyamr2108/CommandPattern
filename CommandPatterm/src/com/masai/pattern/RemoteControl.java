package com.masai.pattern;

public class RemoteControl {
    private Command command;

    public RemoteControl(Command command) {
        this.command=command;
    }

    public void buttonPress() {
        this.command.execute();
    }
}
