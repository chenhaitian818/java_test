package Java高级编程.实验十;

import javax.swing.*;
import java.net.*;
import java.io.*;


public class Client {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        JButton jButton=new JButton();
        jFrame.add(jButton);
        jFrame.setVisible(true);
        String host = "localhost";
        int port = 8888;
        BufferedReader reader = null;
        BufferedWriter writer = null;
        Socket socket = null;
        try {
            // 创建Socket对象并连接服务器
            socket = new Socket(host, port);

            // 获取输入输出流
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            // 循环进行收发消息
            while (true) {
                // 发送消息
                BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("请输入要发送的消息：");
                String msgSend = consoleReader.readLine();
                writer.write(msgSend + "\n");
                writer.flush();

                // 接收消息
                String msgReceived = reader.readLine();
                System.out.println("服务器说：" + msgReceived);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭连接和流
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
