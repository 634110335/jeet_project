package com.example.jeet.visitor;

public abstract class Action {
    //得到男性一个测评结果
    public abstract void getManResult(Man man);

    //得到一个女性测评结果
    public abstract void getWomanResult(WoMan woMan);
}
