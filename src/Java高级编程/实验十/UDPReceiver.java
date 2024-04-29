package Java高级编程.实验十;

import java.net.*;
import java.io.*;

public class UDPReceiver {
    public static void main(String[] args) {
        try {
            // 创建DatagramSocket对象并绑定端口号
            DatagramSocket receiver = new DatagramSocket(54321);
            byte[] buffer = new byte[1024];
            // 循环接收数据报，直到接收到结束标志
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                receiver.receive(packet);
                if (new String(packet.getData(), 0, packet.getLength()).equals("end")) {
                    break;
                }
                // 写入接收到的数据到文件中
                FileOutputStream fos = new FileOutputStream("E:\\java_test\\src\\Java高级编程\\实验十\\123.png", true); // true 参数表示追加到文件末尾
                fos.write(packet.getData(), 0, packet.getLength());
                fos.close();
            }
            // 关闭套接字
            receiver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
