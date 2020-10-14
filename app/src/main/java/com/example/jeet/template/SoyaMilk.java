package com.example.jeet.template;

public abstract class SoyaMilk {
    //模板方法 final 不让紫烈覆盖
    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }
    //选材料
    void select(){
        System.out.println("选择好的黄豆");
    }
    //添加不同配料
    abstract void addCondiments();

    //浸泡
    void soak(){
        System.out.println("第三步：黄豆和配料浸泡");
    }

    void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }
}
