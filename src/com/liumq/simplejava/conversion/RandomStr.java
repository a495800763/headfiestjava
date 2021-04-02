package com.liumq.simplejava.conversion;

/**
 * 使用类型转换实现的随机验证码程序
 */
public class RandomStr {

    public static void main(String[] args) {


        float a  = 5.6f;
        for (int i = 0; i <= 49; i++) {
            System.out.println(String.format("第%1$s个验证码", i) + getRandomStr());
        }

    }

    public static String getRandomStr() {
        //定义一个空字符串
        String result = "";
        for (int i = 0; i < 6; i++) {
            //生成一个97-122 之间的int 类型整数
            int intVal = (int) (Math.random() * 26 + 97);
            result = result + (char) intVal;
        }

        return result;
    }
}
