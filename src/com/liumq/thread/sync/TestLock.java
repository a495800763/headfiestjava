package com.liumq.thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试Lock锁
 */
public class TestLock {


    public static void main(String[] args) {
        TestLock2 testLock2 = new TestLock2();

        new Thread(testLock2, "1").start();
        new Thread(testLock2, "2").start();
        new Thread(testLock2, "3").start();
    }
}


class TestLock2 implements Runnable {

    int ticketNums = 10;

    //定义可重入锁
    private final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();//加锁
            try {
                if (ticketNums > 0) {
                    System.out.println(Thread.currentThread().getName() + " : " + ticketNums--);
                } else {
                    break;
                }
            } finally {
                //解锁
                lock.unlock();
            }
        }
    }
}
