package Java高级编程.实验九;

import javax.swing.*;
import java.awt.*;

public class MyThreadFour implements Runnable {
    private int x;
    private int y;
    private int height = 50;
    private int dx;
    private int targetX;
    private int speed;
    private Color color;

    public MyThreadFour(int x, int y, int targetX, Color color, int speed) {
        this.x = x;
        this.y = y;
        this.targetX = targetX;
        this.color = color;
        this.speed = speed;
        dx = speed;
    }

    public void run() {
        JFrame frame = new JFrame("移动矩形");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 900, 200);
        frame.add(panel);

        while (true) {
            int width = 50;
            if (x + width > targetX || x < 0) {
                dx = -dx;
            }
            x += dx;

            Graphics g = panel.getGraphics();
            g.clearRect(0, 0, 300, 200);
            g.setColor(color);
            g.fillRect(x, y, width, height);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThreadFour first = new MyThreadFour(20, 60, 2000, Color.RED, 3);
        Thread thread1 = new Thread(first, "first");

        MyThreadFour second = new MyThreadFour(100, 60, 200, Color.GREEN, 2);
        Thread thread2 = new Thread(second, "second");

        thread1.start();
        thread2.start();
    }
}
