package com.liumq.simplejava.progress;

public class IfTest {
    public static void main(String[] args) {
        int age = 30;
        if (age <= 20) {
            System.out.println("年龄已经大于20岁了");
            System.out.println("20 岁的人要学会承担责任了");
        } else if (age > 20 && age < 35) {
            System.out.println("年龄大于20 但是不到35 ");
            System.out.println("现在正是事业上升期");
        }
    }
}
