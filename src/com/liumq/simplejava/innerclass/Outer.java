package com.liumq.simplejava.innerclass;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

/**
 * 外部类访问非静态内部类的成员变量必须先new 出内部类的对象
 */
public class Outer {
    private int outProp = 9;

    class Inner {
        private int inProp = 5;

        public void accessOuterProp() {
            //非静态内部类可以直接访问外部类的private 实例变量
            System.out.println("外部类的outProp:" + outProp);
        }
    }

    public void accessinnerprop() {
        //外部类不能直接访问非静态内部类的实例变量
        //下面的代码出现编译错误
        //System.out.println("内部类的inProp值："+inProp);
        //如需访问内部类的实例变量值，必须显式的创建内部类的对象
        System.out.println("内部类的inProp值：" + new Inner().inProp);
    }

    public static void main(String[] args) {
        //执行下面的代码，只是创建了外部类的对象，内部类的对象还未创建（除非调用的构造函数中创建了内部类对象）
        Outer outer = new Outer();
        outer.accessinnerprop();
    }

}
