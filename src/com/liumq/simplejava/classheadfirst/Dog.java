package com.liumq.simplejava.classheadfirst;

public class Dog {
    public void jump(){
        System.out.println("正在执行jump方法");
    }

    public void run(){
        //Dog d = new Dog();
        jump();
        System.out.println("正在执行rum方法");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
    }


}
