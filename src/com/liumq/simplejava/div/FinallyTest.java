package com.liumq.simplejava.div;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis= new FileInputStream("a.txt");
        }catch (IOException ioe)
        {
            System.out.println(ioe.getMessage());
            //return 语句强制方法返回
            //return;
            //使用exit推出虚拟机
            System.exit(1);
        }finally {
            //关闭磁盘文件，回收资源
            if(fis!=null)
            {
                try {
                    fis.close();
                }catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

            System.out.println("执行finally块中的资源回收完毕");
        }
    }
}
