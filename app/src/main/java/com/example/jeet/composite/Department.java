package com.example.jeet.composite;

//系
public class Department extends OrganizationComponent{
    //add remove就不用了写了，因为它是叶子节点
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
