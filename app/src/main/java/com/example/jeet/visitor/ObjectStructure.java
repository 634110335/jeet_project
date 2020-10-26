package com.example.jeet.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {
    //维护了一个集合
    private List<Person> mPeople = new LinkedList<>();

    //添加
    public void attache(Person person) {
        mPeople.add(person);
    }
    //移除
    public void detach(Person p){
        mPeople.remove(p);
    }
    //显示测评情况
    public void display(Action action){
        for (Person person:mPeople){
            person.accept(action);
        }
    }
}
