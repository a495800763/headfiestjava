package com.liumq.thread.sync;

/**
 * 不安全的取钱 示例
 * 俩个人去银行取钱
 */
public class UnsafeBank {
    public static void main(String[] args) {
        //账户
        Account account = new Account(1000, "结婚基金");

        Drawing you = new Drawing(account, 50, "你");
        Drawing girlFriend = new Drawing(account, 100, "你女朋友");

        you.start();
        girlFriend.start();

    }
}


/**
 * 账户
 */
class Account {
    int money;//余额
    String name;//用户名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread {
    Account account;//账户
    //取了多少钱
    int drawingMoney;
    //现在手里还有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //取钱方法
    //synchronized默认的锁对象是this，而不一定是存在竟态的那个对象
    @Override
    public void run() {


        synchronized (account)
        {
            //判断有没有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + ":钱不够，取不了");
                return;
            }

            //sleep可以使问题更容易暴露
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //卡内余额=当前余额-要取的钱
            account.money = account.money - drawingMoney;
            //手里的钱=当前手里的钱+要取的钱
            nowMoney = nowMoney + drawingMoney;

            System.out.println("余额为:" + account.money);
            System.out.println(this.getName() + "手里的钱：" + nowMoney);
        }
    }
}
