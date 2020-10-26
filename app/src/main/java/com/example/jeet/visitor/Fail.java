package com.example.jeet.visitor;

public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人是非评价是失败");
    }

    @Override
    public void getWomanResult(WoMan woMan) {
        System.out.println(" 女人给的评价是失败");
    }
}
