package com.liumq.simplejava.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        //向peoperties 中添加属性
        props.setProperty("username", "yeeku");
        props.setProperty("password", "123456");
        //将peoperties中的kay-value对保存在a.ini文件中
        props.store(new FileOutputStream("a.ini"), "comment line");
        Properties props2 = new Properties();
        //常态化类中可以添加属性
        props2.setProperty("gender", "male");
        props2.load(new FileInputStream("a.ini"));
        System.out.println(props);
    }
}
