package com.liumq.simplejava.systemtest;

public class IdentityHashCodeTest {
    public static void main(String[] args) {
        //下面程序中的s1和s2 是两个不同的对象
        String s1= new String("Hello");
        String s2= new String("Hello");
        //由于String 重写了hashCode方法，所以他们两个的hashCode方法的值一样
        System.out.println(s1.hashCode()+"======"+s2.hashCode());
        //但是由于这两个对象是不同对象，其indentityhashcode一定不同
        System.out.println(System.identityHashCode(s1)+"======"+System.identityHashCode(s2));

        String s3 = "java";
        String s4= "java";
        //s4和s3 是同一个字符串，指向常量池同一块内存，所以其identityhashcode相同
        System.out.println(System.identityHashCode(s3)+"======"+System.identityHashCode(s4));
    }
}
