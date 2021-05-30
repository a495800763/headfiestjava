package com.liumq.thread.sync;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 死锁：多个线程互相持有对方所需要的资源，然后形成僵持
 */
public class DeadLock {

    public static void main(String[] args) {
        MakeUp g1 = new MakeUp(0, "灰姑凉");
        MakeUp g2 = new MakeUp(1, "白雪公主");

        g1.start();
        g2.start();
    }
}


//口红
class LipStick {

}


//镜子
class Mirror {

}


class MakeUp extends Thread {


    /**
     * 需要的资源，全局只有一分，会形成相互争抢
     */
    static LipStick lipStick = new LipStick();
    static Mirror mirror = new Mirror();


    int choice; // 选择
    String girlName; //使用化妆品的女孩


    MakeUp(int choice, String girlName) {
        this.choice = choice;
        this.girlName = girlName;
    }


    @Override
    public void run() {
        //化妆
        try {
            makeUp();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 化妆，互相持有对方需要的资源
     */
    private void makeUp() throws InterruptedException {
        if (choice == 0) {
            synchronized (lipStick)//获得口红的锁
            {
                System.out.println(this.girlName + "使用口红");
                Thread.sleep(2000);
            }
            synchronized (mirror)//一秒钟后 想获得镜子使用
            {
                System.out.println(this.girlName + "使用镜子");
            }


        } else {
            synchronized (mirror)//获得镜子的锁
            {
                System.out.println(this.girlName + "使用镜子");
                Thread.sleep(2000);
            }
            synchronized (lipStick)//一秒钟后 想获得口红使用
            {
                System.out.println(this.girlName + "使用口红");
            }


        }
    }
}

