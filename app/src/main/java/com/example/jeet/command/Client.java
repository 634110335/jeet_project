package com.example.jeet.command;

public class Client {
    public static void main(String[] args) {
        //使用命令设置模式，完成通过遥控器电灯的操作

        //创建电灯的对象
        LightReceiver lightReceiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器来控制
        RemoteController remoteController = new RemoteController();
        //给我们的遥控器设置相关命令，比如no = 0是电灯的开和关操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);

        System.out.println("------按下开的按钮-----");
        remoteController.onButtonWasPush(0);
        System.out.println("-------按下电灯关的按钮-------");
        remoteController.offButtonWasPush(0);
        System.out.println("----------撤销----------");
        remoteController.undoButtonWasButton();
        System.out.println("----------对电视机的操作----------");
        //对电视机的操作
        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        //给我们的遥控器设置相关命令，比如no = 1是电灯的开和关操作
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        System.out.println("------按下电视机开的按钮-----");
        remoteController.onButtonWasPush(1);
        System.out.println("-------按下电视机关的按钮-------");
        remoteController.offButtonWasPush(1);
        System.out.println("----------撤销----------");
        remoteController.undoButtonWasButton();
    }
}
