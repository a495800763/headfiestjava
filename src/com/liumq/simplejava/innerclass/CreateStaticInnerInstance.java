package com.liumq.simplejava.innerclass;


/**
 * 在外部类以外使用静态内部类
 */
public class CreateStaticInnerInstance {
    public static void main(String[] args) {
        staticOut.staticIn in = new staticOut.staticIn();

        /**
         * 上面一行代码可改为如下两行代码
         */
        staticOut.staticIn inNew;
        inNew = new staticOut.staticIn();
    }
}

class staticOut {
    //定义一个静态内部类，不适用任何访问控制符
    //即同一个包中的其他类可以访问该内部类
    static class staticIn {
        public staticIn() {
            System.out.println("静态内部类的构造器");
        }
    }
}
