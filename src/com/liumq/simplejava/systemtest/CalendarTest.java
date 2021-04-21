package com.liumq.simplejava.systemtest;

import java.util.Calendar;
//静态导入类中的类变量
import static java.util.Calendar.*;

/**
 * 日历类test
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //取出年
        System.out.println(c.get(YEAR));
        System.out.println(c.get(MONTH));
        System.out.println(c.get(DATE));

        c.set(2003, 10, 23, 12, 32, 23);
        System.out.println(c.getTime());

        c.add(YEAR, -1);
        System.out.println(c.getTime());
        c.roll(MONTH, -8);
        System.out.println(c.getTime());
    }
}
