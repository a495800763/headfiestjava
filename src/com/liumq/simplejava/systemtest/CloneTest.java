package com.liumq.simplejava.systemtest;

class Address {
    String detail;

    public Address(String detail) {
        this.detail = detail;
    }
}

class User implements Cloneable {
    int age;
    Address address;

    public User(int age) {
        this.age = age;
        address = new Address("湖北武汉");
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}

public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User(29);
        //调用clone 方法得到u2
        User u2 = u1.clone();

        //u1 u2 是不同对象
        System.out.println(u1 == u2);
        //但是u1 u2 的引用类型的成员变量却指向相同

        //此即浅拷贝
        System.out.println(u1.address == u2.address);
    }
}
