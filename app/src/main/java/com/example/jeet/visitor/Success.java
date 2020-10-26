package com.example.jeet.visitor;

public class Success extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价是成功");
    }

    @Override
    public void getWomanResult(WoMan woMan) {
        System.out.println(" 女人给的评价是成功");
    }
}
