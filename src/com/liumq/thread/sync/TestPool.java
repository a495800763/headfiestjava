package com.liumq.thread.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试线程池
 */
public class TestPool {
    public static void main(String[] args) {
        //创建线程池
        //参数为线程池的容量
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        //关闭链接
        service.shutdown();
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
