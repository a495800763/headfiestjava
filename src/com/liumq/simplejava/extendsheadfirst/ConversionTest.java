package com.liumq.simplejava.extendsheadfirst;

/**
 * 类型转换测试
 */
public class ConversionTest {
    public static void main(String[] args) {
        double d = 13.4;
        long l= (long)d;
        System.out.println(l);
        int in = 5;
        //试图把一个数值类型转换成boolean类型时会编译出错
        //boolean b = (boolean) in;\
        Object obj  ="Hello";
        //obj对象编译时的类型为Object，Object 与String 类型存在继承关系，可以强制类型转换;
        //而且obj变量的实际类型时String，所以运行也可以通过
        String objStr = (String)obj;
        System.out.println(objStr);
        //定义一个Object 对象，编译时类型为Object ，运行时类型为Integer
        Object objPre = Integer.valueOf(5);
        //Integer类型无法强制装换成String
        String str  = (String) objPre;
    }
}
