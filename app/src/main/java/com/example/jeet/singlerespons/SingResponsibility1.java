package com.example.jeet.singlerespons;

public class SingResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("小汽车");
        vehicle.run("飞机");
        //单一职责原则
    }
}
//交通工具类
// 方式1
//在run方法中违法了单一职责原则
//解决方案很简单、
//单一职责原则，降低类的复杂度
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle +" 在公路上运行。。。");
    }
}