package com.liumq.simplejava.innerclass;

/**
 * 在外部类以外使用非静态内部类
 */
public class CreateInnerInstance {
    public static void main(String[] args) {
        OuterClass.InnerClass in = new OuterClass().new InnerClass("测试信息");

        //上面代码可以改成如下三行
        OuterClass.InnerClass inNew;

        OuterClass outerClass = new OuterClass();
        inNew = outerClass.new InnerClass("新的测试信息");
    }
}

class OuterClass {
    //定义一个内部类，不使用访问修饰符
    //即只有包中的其他类可以访问该内部类
    class InnerClass {
        public InnerClass(String msg) {
            System.out.println(msg);
        }
    }
}
