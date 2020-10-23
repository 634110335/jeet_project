package com.example.jeet.command;

/**
 * 没有任何执行，初始化按钮，当调用空命令是对象什么事情都不做
 * 这也是一种设置模式，可以省掉对空的判断
 */
public class NoCommand implements Command{

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
