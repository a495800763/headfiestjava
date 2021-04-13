package com.liumq.simplejava.myinterface;

public interface Output {
    //接口中定义的成员变量只能是常量
    int MAX_CACHE_LINE = 50;

    //接口里定义的普通方法只能是public的抽象方法
    void out();

    void getData(String msg);

    //接口中定义的默认方法,需要使用default关键字
    default void print(String... msgs) {
        for (String msg : msgs) {
            System.out.println(msg);
        }
    }
    //接口中定义的默认方法,需要使用default关键字
    default  void test(){
        System.out.println("接口中默认的test方法");
    }

    //接口中定义的类方法，需要使用static修饰
    static String staticTest(){
        return "接口里面的类方法";
    }

    //java8 还不支持接口中带方法体的私有方法，
//    private void foo(){
////        System.out.println("foo私有方法");
////    }

}
