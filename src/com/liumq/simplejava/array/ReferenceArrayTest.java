package com.liumq.simplejava.array;

public class ReferenceArrayTest {
    public static void main(String[] args) {
        //定义一个students数组变量，其类型是Person[]
        Person[] students;
        //执行动态初始化
        students = new Person[2];
        //创建一个Person实例，并将这个Person实例赋值给zhang变量
        Person zhang = new Person();
        //为zhang所引用的Person变量的属性赋值
        zhang.age = 15;
        zhang.height = 158;
        //创建一个Person实例，并将这个Person实例赋值给lee变量
        Person lee = new Person();
        //为lee所引用的Person变量的属性赋值
        lee.age = 16;
        lee.height = 161;
        //将zhang变量赋值给数组的第一个元素
        students[0] = zhang;
        //将lee变量赋值给数组的第二个元素
        students[1] = lee;
        lee.info();
        students[1].info();
    }
}
