package com.liumq.simplejava.extendsheadfirst;

class Creature {
    public Creature() {
        System.out.println("Creature 无参数的构造器 ");
    }
}

class Animal extends Creature {
    private String name;
    private int age;

    public Animal(String name) {
        name = name;
        System.out.println("Animal带参数的一个构造器，该动物的名称是：" + name);
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("Animal带两个参数的构造器,其age是："+age);
    }

}

public class Wolf  extends  Animal{
    public Wolf(){
        super("灰太狼",3);
        System.out.println("wolf的无参数构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }



}
