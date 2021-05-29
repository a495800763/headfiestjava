package com.liumq.thread;

// 测试stop
//1 建议线程正常停止，利用次数，不建议死循环
//2 建议使用标志位-->设置一个标志位
//3 不要使用 stop或者destroy等过时的方法或者JDK 不推荐使用的方法
public class TestThreadStop implements Runnable {

    //设置一个标志位
    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run...... Thread" + i++);
        }
    }

    //设置一个公开的方法停止线程
    public void stop() {
        flag = false;
    }

    public static void main(String[] args) {
        TestThreadStop testStop = new TestThreadStop();

        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("main-- " + i);
            if (i == 900) {
                //调用stop方法切换标志位，让线程停止
                testStop.stop();
                System.out.println("线程停止了");
            }
        }
    }
}
