package com.liumq.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 联系Thread.实现多线程同步下载图片
 */
public class TestThread2 extends Thread {

    private String url; //网络图片的地址
    private String name; //保存的文件名

    public TestThread2(String url, String name1) {
        this.url = url;
        this.name = name1;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为:" + name);
    }


    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://pics1.baidu.com/feed/a2cc7cd98d1001e9ff0cb27789cc8aea55e797db.png?token=0a659bd3edeb25171d43f4f2a15d897b", "image1.jpg");
        TestThread2 t2 = new TestThread2("https://pics5.baidu.com/feed/b7003af33a87e95056f97a25ec881045f9f2b4c0.jpeg?token=dddca13e4be03ab39bbdde751a3a4d5f&s=D38025AB4CF1BFF14C0CA1A503005023", "image2.jpg");
        TestThread2 t3 = new TestThread2("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=245829137,467143050&fm=26&gp=0.jpg", "image3.jpg");

        //t1 t2 t3 的执行完成顺序与启动顺序无关
        t1.start();
        t2.start();
        t3.start();
    }
}

/**
 * 下载器
 */
class WebDownloader {
    /**
     * 下载方法
     */
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
