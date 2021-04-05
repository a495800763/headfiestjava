package com.liumq.simplejava.classheadfirst;

/**
 * this关键字在构造器中
 */
public class ThisInConstructor {
    //定义一个名为foo 的成员变量
    public int foo;

    //这个类的构造函数
    public ThisInConstructor(){
        //在构造器里定义一个foo 变量，但是其实作用于仅仅在构造器中
        int foo=0;
        //使用this关键字指向正在被构造的对象本身,将其成员变量foo 的值设置为6
        this.foo=6;
    }

    public static void main(String[] args) {
        //输出6
        System.out.println(new ThisInConstructor().foo);
    }
}
