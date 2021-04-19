package com.liumq.simplejava.innerclass;

abstract class Device {
    private String name;

    public abstract double getPrice();

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class AnonymousInner {
    public void test(Device d) {
        System.out.println("购买一个" + d.getName() + ",花掉了：" + d.getPrice());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        ai.test(new Device("电子示波器") {
            @Override
            public double getPrice() {
                return 67.8;
            }
        });

        Device d = new Device() {

            //初始化快
            {
                System.out.println("匿名内部类的初始化块");
            }

            @Override
            public double getPrice() {
                return 56.2;
            }

            //重写父类的实现方法
            public String getName() {
                return "机械键盘";
            }
        };

        ai.test(d);
    }
}
