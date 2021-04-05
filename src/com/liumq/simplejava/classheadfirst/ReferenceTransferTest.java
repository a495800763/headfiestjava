package com.liumq.simplejava.classheadfirst;

class DataWrap{
    int a;
    int b;
}

public class ReferenceTransferTest {
    public static void swap(DataWrap dw)
    {
        int temp = dw.a;
        dw.a=dw.b;
        dw.b=temp;
        System.out.println("swap 方法里，a成员变量的值是:"+dw.a+" ;b成员变量的值是:"+dw.b);
        dw=null;
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a=6;
        dw.b=9;
        swap(dw);
        System.out.println("交换完成后，a成员变量的值是:"+dw.a+" ;b成员变量的值是:"+dw.b);
    }
}
