package com.example.jeet.decorator;

//装饰者
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj){//组合
        this.obj = obj;
    }
    @Override
    public float cost() {
        //getPrice自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " +super.getPrice() +"&&" + obj.getDes();
    }
}
