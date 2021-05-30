package com.liumq.thread.sync;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 测试JUC 中线程安全的集合
 */
public class TestJUC {


    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> list.add(Thread.currentThread().getName())).start();
        }


        Thread.sleep(1000);

        System.out.println(list.size());
    }

}
