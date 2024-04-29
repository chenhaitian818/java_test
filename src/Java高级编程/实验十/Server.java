package Java高级编程.实验十;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            // 创建ServerSocket对象并绑定端口号
            ServerSocket server = new ServerSocket(8888);
            System.out.println("服务器已启动，等待客户端连接...");
            // 监听客户端连接请求，创建Socket对象
            Socket socket = server.accept();
            System.out.println("客户端已连接，IP地址为：" + socket.getInetAddress().getHostAddress());
            // 创建输入输出流
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            // 循环读取客户端发送的信息并回复
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(socket.getInetAddress().getHostAddress() + "说：" + line);
                pw.println("服务器回复：" + line);
            }
            // 关闭流和套接字
            br.close();
            pw.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
