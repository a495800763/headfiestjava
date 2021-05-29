package com.liumq.thread.demo02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * 线程穿件方式三：实现callable接口
 *
 * callable 的好处
 * 1 可以定义返回值
 * 2 可以抛出异常不让程序终止
 *
 */
public class TestCallable implements Callable<Boolean> {

    private String url; //网络图片的地址
    private String name; //保存的文件名

    public TestCallable(String url, String name1) {
        this.url = url;
        this.name = name1;
    }

    @Override
    public Boolean call() throws Exception {
        //call方法有返回值,可以在执行完成之后获取
        MyWebDownloader webDownloader = new MyWebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为:" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://pics1.baidu.com/feed/a2cc7cd98d1001e9ff0cb27789cc8aea55e797db.png?token=0a659bd3edeb25171d43f4f2a15d897b", "image1.jpg");
        TestCallable t2 = new TestCallable("https://pics5.baidu.com/feed/b7003af33a87e95056f97a25ec881045f9f2b4c0.jpeg?token=dddca13e4be03ab39bbdde751a3a4d5f&s=D38025AB4CF1BFF14C0CA1A503005023", "image2.jpg");
        TestCallable t3 = new TestCallable("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=245829137,467143050&fm=26&gp=0.jpg", "image3.jpg");


        //创建执行线程的线程池
        ExecutorService service = Executors.newFixedThreadPool(3);


        //t1 t2 t3 的执行完成顺序与启动顺序无关
        Future<Boolean> r1 = service.submit(t1);
        Future<Boolean> r2 = service.submit(t2);
        Future<Boolean> r3 = service.submit(t3);

        Boolean rs1 = r1.get();
        Boolean rs2 = r2.get();
        Boolean rs3 = r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);

        //关闭服务
        service.shutdown();


    }
}

/**
 * 下载器
 */
class MyWebDownloader {
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
