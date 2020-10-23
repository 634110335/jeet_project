package com.example.jeet.command;

public class TVOnCommand implements Command{
    private TVReceiver mTVReceiver;

    public TVOnCommand(TVReceiver TVReceiver) {
        mTVReceiver = TVReceiver;
    }

    @Override
    public void execute() {
        mTVReceiver.on();
    }

    @Override
    public void undo() {
        mTVReceiver.off();
    }
}
