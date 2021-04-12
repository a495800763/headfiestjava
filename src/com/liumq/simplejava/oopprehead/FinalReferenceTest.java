package com.liumq.simplejava.oopprehead;

import java.util.Arrays;

/**
 * final修饰的引用类型变量测试
 * final修饰的引用类型，即指向实际对象内存的指针不会变，但是对象的内容可以被修改
 */
public class FinalReferenceTest {
    public static void main(String[] args) {
        //final 修饰数组变量，iArr是一个引用变量
        final int[] iArr = {5,6,12,9};
        System.out.println(Arrays.toString(iArr));
        //对数组进行排序，合法
        Arrays.sort(iArr);
        iArr[2]=-8;
        System.out.println(Arrays.toString(iArr));
        //下面语句对数组进行重新赋值，非法
        //iArr=null;

        //final修饰Person变量，p是一个引用变量
        final FinalPerson p = new FinalPerson(45);
        //改变p所引用的变量的成员，合法
        p.setAge(23);
        //p引用另外一块地址，非法
        //p=null;

    }
}

class FinalPerson {
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FinalPerson() {
    }

    public FinalPerson(int age) {
        this.age = age;
    }
}
