package com.example.jeet.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    List<OrganizationComponent> mOrganizationComponents = new ArrayList<>();

    @Override
    public void setDes(String des) {
        super.setDes(des);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        mOrganizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        mOrganizationComponents.remove(organizationComponent);
    }

    public College(String name, String des) {
        super(name, des);
    }

    //就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("-------"+getName()+"--------");
        //遍历
        for (OrganizationComponent o :mOrganizationComponents) {
            o.print();
        }
    }
}
