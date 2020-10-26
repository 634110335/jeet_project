package com.example.jeet.visitor;


public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attache(new Man());
        objectStructure.attache(new WoMan());
        //成功
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("====================");
        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("========================");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
