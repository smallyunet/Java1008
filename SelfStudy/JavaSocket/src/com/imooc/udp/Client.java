package com.imooc.udp;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        // 1. 定义服务器信息
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8800;
        byte[] data = "用户名：admin；密码：123".getBytes();
        // 2. 创建数据报
        DatagramPacket packet = new DatagramPacket(data, data.length, address, port);
        // 3. 创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket();
        // 4. 发送数据报
        socket.send(packet);

        /*
         * 接收数据
         */
        // 1. 创建数据报，用于接收服务器端响应数据
        byte[] data2 = new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
        // 2. receive
        socket.receive(packet2);
        // 3. 读取数据
        String reply = new String(data2, 0, packet2.getLength());
        System.out.println("我是客户端，服务器说：" + reply);
        // 4. 关闭资源
        socket.close();
    }

}
