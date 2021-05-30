package com.liumq.thread.test;

//模拟网络延时：放大问题发生的可能性
public class TestSleep implements Runnable {

    //总票数
    private int ticketNums = 10;


    @Override
    public void run() {

        while (true) {

            if (ticketNums <= 0) {
                break;
            }
//            try {
//                //模拟延时
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "票");
        }

    }

    public static void main(String[] args) {
        TestSleep ticket = new TestSleep();


        new Thread(ticket, "小明").start();
        new Thread(ticket, "老师").start();
        new Thread(ticket, "黄牛党").start();
        new Thread(ticket, "公务员").start();
        new Thread(ticket, "军人").start();

    }
}
