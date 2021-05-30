package com.liumq.thread.test;

/**
 * 测试守护线程
 *
 * 虚拟机不管守护线程是否会停止，只要用户线程停止了 守护线程也会停止
 */
public class TestDaemon {


    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        thread.setDaemon(true);//默认false 是用户线程，一般的线程都是用户线程true 是守护线程
        thread.start();

        new Thread(you).start();//用户线程启动，用户线程会停止
    }


}

//上帝
class God implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("上帝保佑着你");
        }
    }
}

//你
class You implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你每天都开心得活着!!!");
        }

        System.out.println("你离开了这个世界");
    }
}
