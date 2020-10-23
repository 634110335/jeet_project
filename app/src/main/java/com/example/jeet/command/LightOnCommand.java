package com.example.jeet.command;

public class LightOnCommand implements Command{
    //聚合LightReceiver
    private LightReceiver mLightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        mLightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接受者的方法
        mLightReceiver.on();
    }

    @Override
    public void undo() {
        mLightReceiver.off();
    }
}
