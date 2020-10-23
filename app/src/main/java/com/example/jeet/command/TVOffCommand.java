package com.example.jeet.command;

public class TVOffCommand implements Command{
    private TVReceiver mTVReceiver;

    public TVOffCommand(TVReceiver TVReceiver) {
        mTVReceiver = TVReceiver;
    }


    @Override
    public void execute() {
        mTVReceiver.off();
    }

    @Override
    public void undo() {
        mTVReceiver.on();
    }
}
