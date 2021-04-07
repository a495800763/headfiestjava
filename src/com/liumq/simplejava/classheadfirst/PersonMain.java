package com.liumq.simplejava.classheadfirst;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(1000);
        System.out.println("可能设置年龄失败，此时年龄是：" + p.getAge());
        p.setAge(30);
        System.out.println("可能设置年龄成功，此时年龄是：" + p.getAge());
        p.setName("柳梦琦");
        System.out.println("此时名称：" + p.getName());
    }
}
