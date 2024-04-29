package Java高级编程.实验二;

import javax.swing.*;
import java.awt.*;

public class test{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JLabel练习");
        jFrame.setBounds(800, 300, 1000, 800);
        jFrame.setLocationRelativeTo(null);
        jFrame.setBackground(new Color(238, 238, 238, 255));
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());


        JLabel jLabelText = new JLabel();
        jLabelText.setText("--眺望大海 放宽心态--");
        jLabelText.setForeground(new Color(23, 42, 222));
        jLabelText.setFont(new Font(null, 0, 40));

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\陈楚\\Desktop\\整车\\test1.jpg");

        JLabel jLabelImg;

        if (imageIcon.getIconWidth() == -1 && imageIcon.getIconHeight() == -1) {
            jLabelImg = new JLabel("加载图片异常");
            jLabelImg.setPreferredSize(new Dimension(800, 600));
            jLabelImg.setOpaque(true);
            jLabelImg.setFont(new Font(null, 0, 40));
            jLabelImg.setHorizontalAlignment(JLabel.CENTER);
            jLabelImg.setBackground(new Color(255, 200, 0));
        } else {
            jLabelImg = new JLabel(imageIcon);
        }

        jFrame.add(jLabelText);
        jFrame.add(jLabelImg);

        jFrame.setVisible(true);
    }

}
