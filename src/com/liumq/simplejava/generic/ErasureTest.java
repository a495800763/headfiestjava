package com.liumq.simplejava.generic;

/**
 * 类型擦除测试
 */
public class ErasureTest {
    public static void main(String[] args) {
        MyApple<Integer> a = new MyApple<>(6);
        //a的getSize方法返回Integer对象
        Integer as = a.getSize();
        //把a对象付给Myapple 变量,丢失尖括号中的类型信息
        MyApple b = a;
        //b的类型是Number
        Number size = b.getSize();
        //下面的代码将引起编译错误
        //Integer size2 =b.getSize();
    }
}

class MyApple<T extends Number> {
    T size;

    public MyApple() {

    }

    public MyApple(T size) {
        this.size = size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public T getSize() {
        return this.size;
    }

}
