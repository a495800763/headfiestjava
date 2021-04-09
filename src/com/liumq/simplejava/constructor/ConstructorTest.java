package com.liumq.simplejava.constructor;

/**
 * 构造器初步
 */
public class ConstructorTest {
    public String name;
    public int count;

    public ConstructorTest(String name, int count) {
        //构造器中的this代表正在被初始化的这个对象
        //将传入的参数赋值给构造对象的实例变量
        this.count = count;
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest("高等数学",6);
        System.out.println(constructorTest.name);
        System.out.println(constructorTest.count);
    }
}
