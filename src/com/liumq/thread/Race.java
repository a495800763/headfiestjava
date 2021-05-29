package com.liumq.thread;

/**
 * 模拟龟兔赛跑
 */
public class Race implements Runnable {


    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            if (Thread.currentThread().getName().equals("兔子") && i % 10 == 0 && i != 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //判断比赛是否结束
            final boolean gameover = gameover(i);
            if (gameover) {
                //比赛结束后停止程序
                break;
            }

            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    private boolean gameover(int steps) {
        if (winner != null) {
            //如果已经存在胜利者
            return true;
        }
        if (steps >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}
