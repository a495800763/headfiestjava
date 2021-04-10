package com.liumq.simplejava.extendsheadfirst;

public class Ostrich extends  Bird {
    @Override
    public void fly() {
        System.out.println("我是鸵鸟，一种鸟类，但是我不会飞");
    }

    public void callOverridedMethod()
    {
        super.fly();
    }

    public static void main(String[] args) {
        //新建鸵鸟对象
        Ostrich os = new Ostrich();
        //鸵鸟是怎么飞的呢
        os.fly();

        //必须调用父类方法的时候呢
        os.callOverridedMethod();
    }
}
