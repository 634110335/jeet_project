package com.example.jeet.factory;

public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }
}
