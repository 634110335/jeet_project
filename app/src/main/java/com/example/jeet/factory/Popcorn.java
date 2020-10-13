package com.example.jeet.factory;

public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn  on");
    }

    public void off(){
        System.out.println(" Popcorn  off");
    }

    public void up(){
        System.out.println("Popcorn up..");
    }
}
