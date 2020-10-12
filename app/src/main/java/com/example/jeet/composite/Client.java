package com.example.jeet.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //创建学校
        OrganizationComponent university = new University("清华大学", "中国顶级的大学");

        //创建学院
        OrganizationComponent college = new College("计算机学院","清华大学计算机学院");
        OrganizationComponent infoCollege = new College("信息工程院","清华大学信息工程院");


        //创建院系

        college.add(new Department("软件工程","软件工程不错"));
        college.add(new Department("网络工程","网络工程不错"));
        college.add(new Department("计算机科学与技术","相当牛逼"));

        infoCollege.add(new Department("通信工程","很好学"));
        infoCollege.add(new Department("信息工程","信息工程好学"));

        //将学院加入到 学校
        university.add(college);
        university.add(infoCollege);

        college.print();
    }
}
