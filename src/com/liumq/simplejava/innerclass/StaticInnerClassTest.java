package com.liumq.simplejava.innerclass;

/**
 * 静态内部类测试
 */
public class StaticInnerClassTest {
    private int prop1 = 5;
    private static int prop2 = 9;

    static class StaticInnerClass {
        //静态内部类中可以包含静态成员
        private static int age;

        public void accessOutProp() {
            //下面代码将出现错误
            //静态内部类无法访问外部类的实例变量
            //System.out.println(prop1);
            //访问外部类的静态变量正常
            System.out.println(prop2);
        }
    }
}
