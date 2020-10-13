package com.example.jeet.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象 生成一个代理对象
    public Object getProxyInstance(){
        /*
            1,loader 指定当前目标对象使用的类加载器,获取加载器的方法固定
            1,interfaces 目标对象实现接口类型，使用泛型的方式确认类型
            3,h 事件处理，执行目标对象方法时，辉触发事情处理方法，会把当前对象作为参数传入

         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK 代理开始");
                //反射机制调用目标对象的方法
                Object invokeVal = method.invoke(target, args);
                return invokeVal;
            }
        });
    }
}
