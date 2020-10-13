package com.example.jeet.proxy.dynamic;

public class TheacherDao implements ITeacherDao{
    @Override
    public void theach() {
        System.out.println("老师正在授课中。。。");
    }
}
