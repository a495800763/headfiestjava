package com.liumq.thread.sync;

/**
 * 测试线程不安全的买票
 */
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"苦逼的我").start();
        new Thread(buyTicket,"牛逼的你们").start();
        new Thread(buyTicket,"傻逼的黄牛党").start();
    }
}

class BuyTicket implements Runnable {

    //票
    private int ticketNums = 10;

    boolean flag = true;//外部停止线程的标志位

    @Override
    public void run() {
        //买票
        while (flag) {
            buy();
        }
    }

    //synchronized 同步方法
    private synchronized void buy() {
        //判断是否有票
        if (ticketNums <= 0) {
            flag = false;
            return;
        }

        //模拟延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //买票
        System.out.println(Thread.currentThread().getName() + "买到了：" + ticketNums--);
    }
}
