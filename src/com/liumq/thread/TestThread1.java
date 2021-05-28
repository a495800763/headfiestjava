package com.liumq.thread;

//创建线程方式一：继承Thread类,重写run方法，调用start开启线程
public class TestThread1 extends Thread {
    @Override
    public void run() {
        //run方法线程体

        for (int i = 0; i < 2000; i++) {
            System.out.println("我在看代码---" + i);
        }

    }

    public static void main(String[] args) {
        //main方法 主线程
        //创建一个thread对象
        final TestThread1 testThread1 = new TestThread1();

        //调用start()方法开启线程
        testThread1.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程---" + i);
        }
    }
}
