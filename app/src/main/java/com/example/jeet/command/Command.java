package com.example.jeet.command;

//创建命令接口
public interface Command {
    void execute();//执行某个操作
    void undo();//撤销动作或者操作
}
