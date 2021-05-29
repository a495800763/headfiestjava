package com.liumq.thread;

/**
 * 模拟倒计时
 *  sleep 不会释放锁
 */
public class TestSleep2 {

    public static void main(String[] args) throws InterruptedException {
        tenDown();
    }

    public static void tenDown() throws InterruptedException {
        int number = 10;

        while (true) {
            Thread.sleep(1000);
            System.out.println(number--);
            if (number <= 0) {
                break;
            }
        }
    }
}
