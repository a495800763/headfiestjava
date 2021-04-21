package com.liumq.simplejava.systemtest;

public class MathTest {
    public static void main(String[] args) {
        /*----------------下面是三角运算-----------------*/
        //将弧度转换成角度
        System.out.println("Math.toDegrees(1.57):" + Math.toDegrees(3.14159265358));
        //将角度转换成弧度
        System.out.println("Math.toRadians(90):"+Math.toRadians(90));
        //计算反余弦，返回的角度在0-pi之间
        System.out.println("Math.acos(1.2):"+Math.acos(1.2));
        //计算反正弦，返回的角度范围在-pi/2-pi/2之间
        System.out.println("Math.asin(0.8):"+Math.asin(0.8));
        //计算反正切，返回的角度范围在-pi/2-pi/2之间
        System.out.println("Math.atan(2.3):"+ Math.atan(2.3));
        //计算三角余弦
        System.out.println("Math.cos(1.57):"+ Math.cos(1.57));
        //计算双曲余弦
        System.out.println("Math.cosh(1.2):"+Math.cosh(1.2));
    }
}
