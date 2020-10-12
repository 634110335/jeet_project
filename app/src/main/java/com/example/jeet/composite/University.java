package com.example.jeet.composite;

import java.util.ArrayList;
import java.util.List;

public class University extends OrganizationComponent{

    List<OrganizationComponent> mOrganizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    //重写add

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        mOrganizationComponents.remove(organizationComponent);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        mOrganizationComponents.add(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //就是输出Universty包含的学院
    @Override
    protected void print() {
        System.out.println("-------"+getName()+"--------");
        //遍历
        for (OrganizationComponent o :mOrganizationComponents) {
            o.print();
        }
    }
}
