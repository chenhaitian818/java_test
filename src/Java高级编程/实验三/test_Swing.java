package Java高级编程.实验三;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.FlatteningPathIterator;

public class test_Swing {
    public static void main(String[] args) {

        //设置字体大小
        Font font = new Font("宋体", Font.BOLD, 30);

        //设置顶层容器JFrame基本属性
        JFrame jFrame = new JFrame("组件演示");
        jFrame.getContentPane().setBackground(Color.LIGHT_GRAY);//设置背景颜色
        jFrame.setLayout(new FlowLayout());//设置流式布局
        jFrame.setBounds(0, 0, 1000, 1000);//窗口大小
        jFrame.setLocationRelativeTo(null);//窗口居中
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗口可关闭
        jFrame.setIconImage(new ImageIcon("E:\\java_test\\src\\Java高级编程\\实验三\\img\\title.png").getImage());//更改窗口图标


        //创建一个菜单栏
        JMenuBar jMenuBar = new JMenuBar();

        //创建一级菜单
        JMenu fileMenu = new JMenu("文件");
        fileMenu.setFont(font);
        JMenu editMenu = new JMenu("编辑");
        editMenu.setFont(font);
        JMenu viewMenu = new JMenu("视图");
        viewMenu.setFont(font);
        JMenu aboutMenu = new JMenu("关于");
        aboutMenu.setFont(font);

        // 一级菜单添加到菜单栏
        jMenuBar.add(fileMenu);
        jMenuBar.add(editMenu);
        jMenuBar.add(viewMenu);
        jMenuBar.add(aboutMenu);

        //创建“文件”的一级子菜单
        JMenuItem newMenuItem = new JMenuItem("新建");
        newMenuItem.setFont(font);
        JMenuItem openMenuItem = new JMenuItem("打开");
        openMenuItem.setFont(font);
        JMenuItem exitMenuItem = new JMenuItem("退出");
        exitMenuItem.setFont(font);

        // 子菜单添加到一级菜单
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator();       // 添加一条分割线
        fileMenu.add(exitMenuItem);

        //创建 "编辑" 一级菜单的子菜单
        JMenuItem copyMenuItem = new JMenuItem("复制");
        copyMenuItem.setFont(font);
        JMenuItem pasteMenuItem = new JMenuItem("粘贴");
        pasteMenuItem.setFont(font);

        // 子菜单添加到一级菜单
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        //创建"视图"一级菜单的子菜单
        final JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("复选框子菜单");
        checkBoxMenuItem.setFont(font);
        final JRadioButtonMenuItem radioButtonMenuItem01 = new JRadioButtonMenuItem("单选按钮子菜单01");
        radioButtonMenuItem01.setFont(font);
        final JRadioButtonMenuItem radioButtonMenuItem02 = new JRadioButtonMenuItem("单选按钮子菜单02");
        radioButtonMenuItem02.setFont(font);

        // 子菜单添加到一级菜单
        viewMenu.add(checkBoxMenuItem);
        viewMenu.addSeparator();                // 添加一个分割线
        viewMenu.add(radioButtonMenuItem01);
        viewMenu.add(radioButtonMenuItem02);

        //其中两个 单选按钮子菜单，要实现单选按钮的效果，需要将它们放到一个按钮组中
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioButtonMenuItem01);
        btnGroup.add(radioButtonMenuItem02);

        // 默认第一个单选按钮子菜单选中
        radioButtonMenuItem01.setSelected(true);

        //菜单项的点击/状态改变事件监听，事件监听可以直接设置在具体的子菜单上（这里只设置其中几个）
        // 设置 "新建" 子菜单被点击的监听器
        newMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("新建 被点击");
            }
        });

        // 设置 "打开" 子菜单被点击的监听器
        openMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("打开  被点击");
            }
        });
        // 设置 "退出" 子菜单被点击的监听器
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("退出  被点击");
            }
        });

        // 设置 复选框子菜单 状态改变 监听器
        checkBoxMenuItem.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("复选框是否被选中: " + checkBoxMenuItem.isSelected());
            }
        });

        // 设置 单选按钮子菜单 状态改变 监听器
        radioButtonMenuItem01.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("单选按钮01 是否被选中: " + radioButtonMenuItem01.isSelected());
            }
        });

        //将菜单栏添加到窗口
        jFrame.setJMenuBar(jMenuBar);

        //创建文本框JTextField
        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(150, 50));
        jTextField.setColumns(15);
        jTextField.setEditable(true);
        jTextField.setFont(font);

        jFrame.add(jTextField);

        //创建按钮
        JButton jButton = new JButton("拷贝");
        jButton.setFont(new Font("拷贝", 0, 45));
        jFrame.add(jButton);



        //创建文本域
        JTextArea jTextArea = new JTextArea(10, 12);
        jTextArea.setFont(font);
        jTextArea.setEditable(false);
        jTextArea.setLineWrap ( true );
        jFrame.add(jTextArea);

        //创建按钮点击事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.append(jTextField.getText());
            }
        });

        //单选按钮
        JRadioButton jRadioButton1 = new JRadioButton("男");
        jRadioButton1.setFont(font);
        JRadioButton jRadioButton2 = new JRadioButton("女");
        jRadioButton2.setFont(font);

        //其中两个 单选按钮，要实现单选按钮的效果，需要将它们放到一个按钮组中
        JPanel checkPan2 = new JPanel();
        checkPan2.add(jRadioButton1);
        checkPan2.add(jRadioButton2);

        // 默认第一个单选按钮子菜单选中
        jRadioButton1.setSelected(true);
        //添加进jf
        jFrame.add(checkPan2);

        //多选按钮
        JCheckBox jCheckBox1 = new JCheckBox("足球");
        jCheckBox1.setFont(font);
        JCheckBox jCheckBox2 = new JCheckBox("篮球");
        jCheckBox2.setFont(font);
        JCheckBox jCheckBox3 = new JCheckBox("羽毛球");
        jCheckBox3.setFont(font);
        JCheckBox jCheckBox4 = new JCheckBox("乒乓球");
        jCheckBox4.setFont(font);

        //创建面板容器
        JPanel checkPan = new JPanel();
        checkPan.add(jCheckBox1);
        checkPan.add(jCheckBox2);
        checkPan.add(jCheckBox3);
        checkPan.add(jCheckBox4);
        checkPan.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLACK, 2),
                "选择运动", TitledBorder.CENTER, TitledBorder.TOP, font));
        jFrame.add(checkPan);//添加到jf中

        //创建下拉列表
        String[] items = {"红色","黄色","蓝色"};
        JComboBox<String> comBox = new JComboBox<>(items);
        comBox.setFont(font);
        comBox.setPreferredSize(new Dimension(100,50));
        jFrame.add(comBox);


        jFrame.setVisible(true);//窗口可见
    }

}
