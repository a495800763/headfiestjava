package com.liumq.thread;

/**
 * 多个线程同时操作同一个操作
 * 涉及到资源的竟态
 *
 * 发现问题：多个线程操作同一个资源时，线程不安全，数据紊乱
 */
public class TestThread4 implements Runnable {

    //总票数
    private int ticketNums = 40;


    @Override
    public void run() {

        while (true) {

            if (ticketNums < 1) {
                break;
            }
            try {
                //模拟延时
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "票");
        }

    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();


        new Thread(ticket, "小明").start();
        new Thread(ticket, "老师").start();
        new Thread(ticket, "黄牛党").start();
        new Thread(ticket, "公务员").start();
        new Thread(ticket, "军人").start();

    }
}
