package com.liumq.simplejava.classheadfirst;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        //执行合理性校验，要求用户名必须在2-6位之间
        if (name.length() > 6 || name.length() < 2) {
            System.out.println("您输入的用户名不符合要求");
            return;
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 110) {
            System.out.println("您输入的用户年龄不符合要求");
            return;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }


    public void say(String content) {
        System.out.println(content);
    }

}
