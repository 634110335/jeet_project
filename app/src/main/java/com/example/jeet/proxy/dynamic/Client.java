package com.example.jeet.proxy.dynamic;



public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TheacherDao theacherDao = new TheacherDao();

        //给目标对象，创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(theacherDao);
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        System.out.println(proxyInstance.getClass());

        //通过代理对象调用代理目标对象方法
        proxyInstance.theach();
    }
}
