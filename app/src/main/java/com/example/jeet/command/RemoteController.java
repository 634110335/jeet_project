package com.example.jeet.command;

public class RemoteController {

    //开按钮的命令数组
    Command[] onCommand;
    Command[] offCommand;

    //执行撤销的命令
    Command undoCommand;

    public RemoteController() {
       onCommand = new Command[5];
       offCommand = new Command[5];
        for (int i = 0; i <5 ; i++) {
            onCommand[i] = new NoCommand();
            offCommand[i] = new NoCommand();
        }
    }

    //设置命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        this.onCommand[no] = onCommand;
        this.offCommand[no] = offCommand;
    }

    //按下开的按钮
    public void onButtonWasPush(int no){
        //执行找到按下的按钮，并调用对应的方法
        onCommand[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = onCommand[no];
    }

    //按下关的按钮
    public void offButtonWasPush(int no){
        //执行找到按下关的按钮，并调用对应的方法
        offCommand[no].execute();
        //记录这次的操作，用于撤销
        undoCommand = offCommand[no];
    }

    //按下撤销按钮
    public void undoButtonWasButton(){
        undoCommand.undo();
    }
}
