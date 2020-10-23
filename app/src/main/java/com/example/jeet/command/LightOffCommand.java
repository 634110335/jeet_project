package com.example.jeet.command;

public class LightOffCommand implements Command{
    private LightReceiver mLightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        mLightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        mLightReceiver.off();
    }

    @Override
    public void undo() {
        mLightReceiver.on();
    }
}
