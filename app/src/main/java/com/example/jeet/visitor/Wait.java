package com.example.jeet.visitor;

public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男的给的评价是待定");
    }

    @Override
    public void getWomanResult(WoMan woMan) {
        System.out.println("女的给的评价是待定");
    }
}
