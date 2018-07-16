package com.imooc.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 服务器端 UDP
 */
public class Server {
    public static void main(String[] args) throws SocketException, IOException {
        // 1. 创建服务器端DatagramSocket
        DatagramSocket socket = new DatagramSocket(8800);
        // 2. 创建数据报，用于接收客户端发送的数据
        byte[] data = new byte[1024];   // 创建字节数组，指定接收到的数据包大小
        DatagramPacket packet = new DatagramPacket(data, data.length);
        // 3. 接收客户端发送的数据
        System.out.println("***服务器端已经启动，等待客户端发送数据***");
        socket.receive(packet); // 接收到数据报之前一直阻塞
        // 4. 读取数据
        String info = new String(data, 0, packet.getLength());
        System.out.println("我是服务器，客户端说：" + info);

        /*
         * 向客户端响应数据
         */
        // 1. 定义客户端地址
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        byte[] data2 = "欢迎您！".getBytes();
        // 2. 创建数据报，包含相应信息
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length, address, port);
        // 3. 响应客户端
        socket.send(packet2);
        // 4. 关闭资源
        socket.close();
    }
}
