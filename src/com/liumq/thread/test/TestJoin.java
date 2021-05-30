package com.liumq.thread.test;

/**
 * 测试join方法,插队
 */
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("VIP 来了" + i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin join = new TestJoin();
        Thread t = new Thread(join);
        t.start();

        for (int i = 0; i < 500; i++) {
            if (i == 200) {
                t.join();
            }
            System.out.println("main 在执行：" + i);
        }
    }
}
