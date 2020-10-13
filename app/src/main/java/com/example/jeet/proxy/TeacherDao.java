package com.example.jeet.proxy;

import java.sql.SQLOutput;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中。。。");
    }
}
