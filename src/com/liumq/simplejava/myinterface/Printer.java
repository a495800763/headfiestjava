package com.liumq.simplejava.myinterface;

//定义一个product接口
interface Product {
    //实现该接口的类应该能返回产品时间int值
    int getProductTime();
}

//让printer类实现Output接口和Product接口
public class Printer implements Output, Product {

    private String[] printData = new String[MAX_CACHE_LINE];
    //用以记录当前打印的作业数
    private int dataDum = 0;


    @Override
    public void out() {
        //只要还有作业就继续打印
        while (dataDum > 0) {
            System.out.println("打印机打印:" + printData[0]);
            //把作业队列整体向前移动一位，并将剩下的作业数-1
            System.arraycopy(printData, 1, printData, 0, --dataDum);
        }

    }

    @Override
    public void getData(String msg) {
        if (dataDum >= MAX_CACHE_LINE) {
            System.out.println("队列已满，添加失败");
        } else {
            //把打印数据添加到队列里，已保存的数据数量加一
            printData[dataDum++] = msg;
        }
    }


    @Override
    public int getProductTime() {
        return 45;
    }

    public static void main(String[] args) {
        //创建一个Printer对象当成Output对象使用
        Output o = new Printer();
        o.getData("轻量级javaEE 企业应用实战");
        o.getData("疯狂java讲义");
        o.out();
        o.getData("疯狂android讲义");
        o.getData("疯狂Ajax讲义");
        o.out();
        o.print("艾伦耶格尔","米卡莎阿克曼","阿尔敏安诺德");
        o.test();
        //创建一个product对象当成product使用
        Product P = new Printer();
        System.out.println(P.getProductTime());
    }
}
