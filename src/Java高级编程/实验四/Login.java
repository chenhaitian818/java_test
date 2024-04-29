package Java高级编程.实验四;
import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("欢迎登录白云在线");
        frame.setVisible(true);                    //设置窗口可见
        frame.setBounds(0,0,450,520);    //设置窗口的位置（x坐标，y坐标）和窗体大小（长，宽）
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //创建顶层面板
        JTabbedPane above = new JTabbedPane();
        frame.getContentPane().add(above);
        above.setBounds(0,0,430,480);
        //创建左面板
        JPanel jPanel = new JPanel();
        jPanel.setBounds(0,0,430,480);
        jPanel.setBackground(Color.white);
        above.add("扫码登录",jPanel);

        //创建中面板
        JPanel jPanel2 = new JPanel();
        jPanel2.setBounds(0,0,430,480);
        jPanel2.setBackground(Color.white);
        above.add("账号登录",jPanel2);
        //创建右面板
        JPanel jPanel3 = new JPanel();
        jPanel3.setBounds(0,0,430,480);
        jPanel3.setBackground(Color.white);
        above.add("手机号登录",jPanel3);

        //创建左面板顶层标签
        top(jPanel);
        //创建左面板中间内容
        middle(jPanel);
        //创建左面板底层标签
        boottom(jPanel);

        //创建中间面板顶层标签
        top(jPanel2);
        //创建中间面板中间内容
        middle2(jPanel2);
        //创建中间面板底层标签
        boottom(jPanel2);

        //创建右边面板顶层标签
        top(jPanel3);
        //创建右边面板中间内容
        middle3(jPanel3);
        //创建右边面板底层标签
        boottom(jPanel3);

        //添加标签到面板
        frame.setVisible(true);
    }

    public static void top(JPanel jPanel){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,430,100);
        panel.setBackground(Color.white);

        JLabel label = new JLabel("统一身份认证系统");
        label.setPreferredSize(new Dimension(300,100));
        label.setOpaque(true);
        label.setBackground(Color.white);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Serief", Font.BOLD, 20));
        ImageIcon pass = new ImageIcon("E:\\java_test\\src\\Java高级编程\\实验四\\img\\pass.png");
        label.setIcon(pass);

        panel.add(label);
        jPanel.add(panel);
    }

    public static void boottom(JPanel jPanel){
        JPanel panel3 = new JPanel();
        panel3.setBounds(0,0,430,180);
        jPanel.add(panel3);

        JLabel label3 = new JLabel("360浏览器请使用极速模式");
        label3.setPreferredSize(new Dimension(430,20));
        label3.setOpaque(true);
        label3.setFont(new Font("Serief", Font.BOLD, 20));
        panel3.add(label3);

        JPanel panel4 = new JPanel();
        panel4.setBounds(0,0,430,160);
        jPanel.add(panel4);

        JLabel label4 = new JLabel("建议浏览器:");
        label4.setPreferredSize(new Dimension(130,80));
        label4.setOpaque(true);
        label4.setFont(new Font("Serief", Font.BOLD, 20));
        panel4.add(label4);

        ImageIcon guge = new ImageIcon("E:\\java_test\\src\\Java高级编程\\实验四\\img\\谷歌.png");
        JLabel label5 = new JLabel(guge);
        ImageIcon IE = new ImageIcon("E:\\java_test\\src\\Java高级编程\\实验四\\img\\IE.png");
        JLabel label6 = new JLabel(IE);
        ImageIcon huohu = new ImageIcon("E:\\java_test\\src\\Java高级编程\\实验四\\img\\火狐.png");
        JLabel label7 = new JLabel(huohu);
        panel4.add(label5);
        panel4.add(label6);
        panel4.add(label7);
    }

    public static void middle(JPanel jPanel){
        JPanel panel2 = new JPanel();
        panel2.setBounds(0,0,430,200);
        panel2.setBackground(Color.white);

        ImageIcon twoweima = new ImageIcon("E:\\java_test\\src\\Java高级编程\\实验四\\img\\二维码.png");
        JLabel label2 = new JLabel(twoweima);

        panel2.add(label2);
        JLabel jbl = new JLabel("");
        jbl.setPreferredSize(new Dimension(5,80));
        jbl.setOpaque(true);
        jbl.setBackground(Color.white);
        jbl.setForeground(Color.white);
        jbl.setFont(new Font("Serief", Font.BOLD, 20));
        panel2.add(jbl);
        jPanel.add(panel2);
    }

    public static void middle2(JPanel jPanel){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,430,200);
        panel.setBackground(Color.white);
        panel.setLayout(new FlowLayout());

        JTextField textField = new JTextField("用户名或工号");
        textField.setPreferredSize(new Dimension(430,25));
        textField.setColumns(30);
        textField.setSelectedTextColor(Color.lightGray);
        textField.setForeground(Color.black);
        textField.setFont(new Font("Serief", Font.BOLD, 13));
        textField.setEditable(true);
        panel.add(textField);
        jPanel.add(panel);

        JPanel panel1 = new JPanel();
        panel1.setBounds(0,0,430,150);
        panel1.setBackground(Color.white);
        panel1.setLayout(new FlowLayout());

        JPasswordField passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(430,25));
        passwordField.setColumns(30);
        passwordField.setSelectedTextColor(Color.lightGray);
        passwordField.setForeground(Color.black);
        passwordField.setFont(new Font("Serief", Font.BOLD, 13));
        panel1.add(passwordField);
        jPanel.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0,0,430,150);
        panel2.setBackground(Color.white);
        panel2.setLayout(new FlowLayout());

        JTextField textField2 = new JTextField("验证码");
        textField2.setPreferredSize(new Dimension(30,30));
        textField2.setColumns(10);
        textField2.setSelectedTextColor(Color.lightGray);
        textField2.setForeground(Color.black);
        textField2.setFont(new Font("Serief", Font.BOLD, 9));
        textField2.setEditable(true);
        panel2.add(textField2);

        ImageIcon imageIcon = new ImageIcon("E:\\java_test\\src\\Java高级编程\\实验四\\img\\验证码.png");
        JLabel label = new JLabel(imageIcon);
        panel2.add(label);

        JLabel label2 = new JLabel("换一张");
        label2.setFont(new Font("Serief", Font.BOLD, 13));
        panel2.add(label2);
        jPanel.add(panel2);

        JLabel label3 = new JLabel("     ");
        label3.setFont(new Font("Serief", Font.BOLD, 13));
        panel2.add(label3);

        JPanel panel3 = new JPanel();
        panel3.setBounds(0,0,430,40);
        panel3.setBackground(Color.white);
        panel3.setLayout(new FlowLayout());

        JLabel label4 = new JLabel("                            ");
        label4.setFont(new Font("Serief", Font.BOLD, 25));
        panel3.add(label4);

        JLabel label5 = new JLabel("密码找回");
        label5.setFont(new Font("Serief", Font.BOLD, 15));
        panel3.add(label5);
        jPanel.add(panel3);

        JPanel panel4 = new JPanel();
        panel4.setBounds(0,0,430,30);
        panel4.setBackground(Color.white);
        panel4.setLayout(new FlowLayout());

        JButton button = new JButton("登 录");
        button.setPreferredSize(new Dimension(300, 50));
        button.setFont(new Font(null,Font.BOLD,20));
        button.setForeground(Color.white);
        button.setBackground(new Color(0xF53B93D1, true));

        panel4.add(button);
        jPanel.add(panel4);
    }

    public static void middle3(JPanel jPanel){
        JPanel panel = new JPanel();
        panel.setBounds(0,0,430,150);
        panel.setBackground(Color.white);
        panel.setLayout(new FlowLayout());

        JTextField field = new JTextField("手机号码");
        field.setPreferredSize(new Dimension(430,25));
        field.setColumns(15);
        field.setSelectedTextColor(Color.lightGray);
        field.setForeground(Color.lightGray);
        field.setFont(new Font("Serief", Font.BOLD, 25));
        field.setEditable(true);

        panel.add(field);
        jPanel.add(panel);

        JPanel panel2 = new JPanel();
        panel2.setBounds(0,0,430,150);
        panel2.setBackground(Color.white);
        panel2.setLayout(new FlowLayout());

        JTextField field2 = new JTextField("动态密码");
        field2.setPreferredSize(new Dimension(430,25));
        field2.setColumns(15);
        field2.setSelectedTextColor(Color.lightGray);
        field2.setForeground(Color.lightGray);
        field2.setFont(new Font("Serief", Font.BOLD, 25));
        field2.setEditable(true);

        panel2.add(field2);
        jPanel.add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setBounds(0,0,430,150);
        panel3.setBackground(Color.white);
        panel3.setLayout(new FlowLayout());

        JLabel label2 = new JLabel("                               ");
        label2.setFont(new Font("Serief", Font.BOLD, 30));
        panel3.add(label2);

        JLabel label = new JLabel("发送验证码");
        label.setFont(new Font("Serief", Font.BOLD, 15));
        panel3.add(label);
        jPanel.add(panel3);

        JPanel panel4 = new JPanel();
        panel4.setBounds(0,0,430,30);
        panel4.setBackground(Color.white);
        panel4.setLayout(new FlowLayout());

        JButton button = new JButton("登 录");
        button.setPreferredSize(new Dimension(300, 50));
        button.setFont(new Font(null,Font.BOLD,20));
        button.setForeground(Color.white);
        button.setBackground(new Color(0xF53B93D1, true));

        panel4.add(button);
        jPanel.add(panel4);
    }
}
