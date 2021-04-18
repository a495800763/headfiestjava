package com.liumq.simplejava.innerclass;

public class StaticTest {

    //定义一个非静态内部类,是一个空的类
    private class In{

    }

    public static void main(String[] args) {
        //下面的代码将引发编译异常，因为静态成员(main 方法)无法访问非静态成员(In内部类)
        //new In();
    }

}
