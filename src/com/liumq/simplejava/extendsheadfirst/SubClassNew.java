package com.liumq.simplejava.extendsheadfirst;

class BaseClss{
    public int book = 6;
    public void base (){
        System.out.println("父类的普通方法");
    }
    public void test (){
        System.out.println("父类的被覆盖的方法");
    }
}
public class SubClassNew  extends  BaseClss{
    public String book = "轻量级javaEE企业应用实战";

    @Override
    public void test() {
        System.out.println("子类覆盖父类的test 方法");
    }

    public void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        //下面编译时类型和运行时类型完全一样，因此不存在多态
        BaseClss bc = new BaseClss();
        //输出6
        System.out.println(bc.book);
        bc.base();
        bc.test();
        //下面编译时类型和运行时类型完全一样，因此不存在多态
        SubClassNew sc = new SubClassNew();
        //输出 轻量级javaEE企业应用实战
        System.out.println(sc.book);
        //下面将调用从父类继承的base方法
        sc.base();
        //下面将调用自己override 的test 方法
        sc.test();
        //下面编译时类型和运行时类型 不一样，发生多态
        BaseClss ploymophicBc =new SubClassNew();
        //输出6 说明访问的是父类对象的实例变量
        //因为 java 中类型的实例变量不具备多态性
        System.out.println(ploymophicBc.book);
        ploymophicBc.base();
        ploymophicBc.test();
        ((SubClassNew)ploymophicBc).sub();
    }
}
