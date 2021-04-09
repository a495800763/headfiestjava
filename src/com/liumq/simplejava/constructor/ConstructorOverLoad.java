package com.liumq.simplejava.constructor;

public class ConstructorOverLoad {
    public String name;
    public int count;

    //提供无参数的构造器
    public ConstructorOverLoad() {
    }

    //重载有参数的构造器
    public ConstructorOverLoad(String name, int count) {
        this.count = count;
        this.name = name;
    }

    public static void main(String[] args) {
        //通过无参数构造器构造对象1
        ConstructorOverLoad cc1 = new ConstructorOverLoad();
        //通过有参数的构造器构造对象2
        ConstructorOverLoad cc2 = new ConstructorOverLoad("高等数学", 5);
        System.out.println(cc1.name + " " + cc1.count);
        System.out.println(cc2.name + " " + cc2.count);
    }
}
