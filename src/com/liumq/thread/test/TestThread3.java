package com.liumq.thread.test;

/**
 * 创建线程方式2：实现runnable接口，重写run方法,
 * 执行线程需要将runnable接口的实现类的对象作为参数扔给Thread构造函数
 * 再调用thread对象的start方法
 *
 * 推荐使用runnable 接口
 */
public class TestThread3 implements Runnable {
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在看代码---" + i);
        }
    }

    public static void main(String[] args) {
        //创建一个runnable接口的实现类对象
        final TestThread3 testThread3 = new TestThread3();
//        Thread thread = new Thread(testThread3);
//        thread.start();
        new Thread(testThread3).start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我在学习多线程---" + i);
        }
    }
}
