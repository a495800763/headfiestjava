package com.liumq.thread.test;

/**
 * 测试线程的yield(礼让)
 * 礼让不一定成功  看CPU 心情(调度)
 */
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield, "A").start();
        new Thread(myYield, "B").start();
    }
}

class MyYield implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":线程开始执行");
        Thread.yield();//礼让 不一定成功
        System.out.println(Thread.currentThread().getName() + ":线程停止执行");
    }
}
