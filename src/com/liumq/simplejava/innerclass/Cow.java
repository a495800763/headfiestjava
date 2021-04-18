package com.liumq.simplejava.innerclass;

/**
 * 体验内部类
 */
public class Cow {
    private double weight;

    //外部类的两个重载的构造器
    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    //定义一个非静态内部类
    private class CowLeg {
        //内部类的两个实例变量
        private double length;
        private String color;

        //内部类的两个重载的构造器
        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.color = color;
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        //内部类的实例方法
        public void info() {
            System.out.println("当前的牛腿颜色是：" + color + "，高度是：" + length);
            //内部类直接访问外部类的private修饰的成员变量
            System.out.println("本牛腿所在的奶牛的重量是：" + weight);
        }
    }


    public void test() {
        CowLeg cl = new CowLeg(1.12, "黑白相间");
        cl.info();
    }

    public static void main(String[] args) {
        Cow c = new Cow(378.9);
        c.test();
    }
}
