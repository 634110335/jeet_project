package com.example.jeet.factory;

public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }
}
