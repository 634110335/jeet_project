package com.example.jeet.visitor;

/**
 * 1,这里用到了双分派，即首先在客户端的程序中将具体的状态
 * 作为参数传递到了WoMan完成了一次分派
 * 2，然后WoMan类调用了作为参数的具体方法中的方法gretWomanResult，同时将自己
 * 作为参数传入完成第二次的分派
 */
public class WoMan extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
