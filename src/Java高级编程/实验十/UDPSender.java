package Java高级编程.实验十;

import java.net.*;
import java.io.*;

public class UDPSender {
    public static void main(String[] args) {
        try {
            // 创建DatagramSocket对象并绑定端口号
            DatagramSocket sender = new DatagramSocket(12345);
            // 读取要发送的文件
            File file = new File("E:\\java_test\\src\\Java高级编程\\实验十\\123.png");
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int len;
            // 循环读取文件内容并发送数据报
            while ((len = fis.read(buffer)) != -1) {
                DatagramPacket packet = new DatagramPacket(buffer, len, InetAddress.getByName("192.168.0.2"), 54321);
                sender.send(packet);
            }
            // 发送结束标志
            DatagramPacket endPacket = new DatagramPacket("接收结束".getBytes(), 3, InetAddress.getByName("192.168.0.2"), 54321);
            sender.send(endPacket);
            System.out.println("接收完毕");
            // 关闭流和套接字
            fis.close();
            sender.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
