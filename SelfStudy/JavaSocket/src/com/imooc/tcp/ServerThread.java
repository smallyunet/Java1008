package com.imooc.tcp;

import java.io.*;
import java.net.Socket;

/**
 * 服务器线程处理类
 */
public class ServerThread extends Thread {
    // 和本线程相关的Socket
    Socket socket = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    // 线程执行，响应客户端
    public void run() {
        InputStream is = null;   // 字节输入流
        InputStreamReader isr = null;  // 字节流转换字符流
        BufferedReader br = null;   // 为输入流添加缓冲
        OutputStream os = null;
        PrintWriter pw = null;   // 包装为打印流
        try {
            // 3. 获取输入流，并读取客户端信息
            is = socket.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {
                System.out.println("我是服务器，客户端说：" + info);
            }
            socket.shutdownInput(); // 关闭输入流

            // 4. 获取输出流，相应客户端请求
            os = socket.getOutputStream();
            pw = new PrintWriter(os);
            pw.write("欢迎您！");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 5.关闭资源
            try {
                if (pw != null)
                    pw.close();
                if (os != null)
                    os.close();
                if (br != null)
                    br.close();
                if (isr != null)
                    isr.close();
                if (is != null)
                    is.close();
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
