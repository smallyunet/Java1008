package com.imooc.test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * URL常用方法
 */
public class Url {
    public static void main(String[] args) {
        try {
            // 创建URL实例
            URL imooc = new URL("http://www.imooc.com");
            URL url = new URL(imooc, "/index.html?username=tom#test");
            System.out.println("协议：" + url.getProtocol());
            System.out.println("主机：" + url.getHost());
            // 如果未指定端口号，则使用默认的端口号，此时getPort()方法返回值为-1
            System.out.println("端口：" + url.getPort());
            System.out.println("文件路径：" + url.getPath());
            System.out.println("文件名称：" + url.getFile());
            System.out.println("相对路径：" + url.getRef());
            System.out.println("查询字符串：" + url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
