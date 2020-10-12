package com.example.jeet.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下订单
        Drink order = new LongBlack();
        System.out.println("费用 1="+order.cost());
        System.out.println("描述="+order.getDes());
        //加入一份牛奶
        order = new Milk(order);
        System.out.println("order 加入一份牛奶 费用 = "+order.cost());
        System.out.println("order 加入一份牛奶 描述 = "+order.getDes());

        //加入一份巧克力
        order = new Chocolate(order);
        System.out.println("order 加入一份牛奶 + 巧克力 费用 = "+order.cost());
        System.out.println("order 加入一份牛奶 + 巧克力 描述 = "+order.getDes());

        System.out.println("======================");

        Drink order2 = new Decaf();
        System.out.println("无因咖啡 费用="+order2.getPrice());
        System.out.println("无因咖啡 描述="+order2.getDes());
    }
}
