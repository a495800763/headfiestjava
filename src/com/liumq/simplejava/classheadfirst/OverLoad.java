package com.liumq.simplejava.classheadfirst;

/**
 * 重载方法
 */
public class OverLoad {
    public void test() {
        System.out.println("无参数的方法");
    }

    public void test(String msg) {
        System.out.println("重载的有参数的同名方法,参数是：" + msg);
    }

    public static void main(String[] args) {
        OverLoad ol = new OverLoad();
        ol.test();
        ol.test("hello world");
    }
    //因为在方法调用时 ，返回值可以缺省，因此返回值的区别不能用来重载方法,

}
