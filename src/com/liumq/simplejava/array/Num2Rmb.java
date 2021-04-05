package com.liumq.simplejava.array;

import java.util.Arrays;

/**
 * 数字转人民币大写的程序
 */
public class Num2Rmb {
    private String[] hanArr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private String[] unitArr = {"拾", "佰", "仟"};


    /**
     * 把一个浮点数分解成整数部分和小数部分字符串
     *
     * @param num 需要被分解的浮点数
     * @return 分解出来的整数部分和小数部分, 第一个数组元素是整数部分, 第二个数组元素是小数部分
     */
    private String[] divide(double num) {
        //将一个浮点数强制转换为long类型，即得到它的整数部分
        long zheng = (long) num;
        //浮点数本身减去其整数部分，得到小数部分，乘以100后再取整得到前两位小数
        long xiao = Math.round((num - zheng) * 100);
        //下面用了2种方式将整数转换成字符串
        return new String[]{zheng + "", String.valueOf(xiao)};
    }

    /**
     * 把一个四位的数字字符转换成汉字字符,仅支持四位数字
     * @param numStr
     * @return
     */
    private String toHanStr(String numStr) {
        String result = "";
        int numLength = numStr.length();
        //依次遍历数字字符串的每一位数字

        for (int i = 0; i < numLength; i++) {
            //把char型数字转换成int型数字，因为它们的ASCII码值恰好相差48
            //因此把char型数字减去48 后得到int型数字
            int num = numStr.charAt(i) - 48;
            //如果不是最后一位数字且数字不是零，需要添加 十百千的单位
            if (i != numLength - 1 && num != 0) {
                result += hanArr[num] + unitArr[numLength - 2 - i];
            } else {
                result += hanArr[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Num2Rmb nr = new Num2Rmb();

        System.out.println(Arrays.toString(nr.divide(236711125.123)));
        System.out.println(nr.toHanStr("6109"));
    }
}
