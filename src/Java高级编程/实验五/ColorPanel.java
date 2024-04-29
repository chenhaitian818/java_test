package Java高级编程.实验五;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPanel extends JPanel implements ActionListener {
    private JButton redBtn, blackBtn, whiteBtn, blueBtn;
    private JPopupMenu popupMenu;
    private JMenuItem redItem, blackItem, whiteItem, blueItem;

    Font font1=new Font("My Font",0,40);
    Font font2=new Font("My Font",0,30);

    public ColorPanel() {
        setLayout(new BorderLayout());

        // create color panel and add to top of main panel
        JPanel colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(1000, 730));
        colorPanel.setBackground(Color.WHITE);
        add(colorPanel, BorderLayout.NORTH);

        // create button panel and add to bottom of main panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        buttonPanel.setPreferredSize(new Dimension(1000, 200));
        add(buttonPanel, BorderLayout.SOUTH);

        // create buttons
        redBtn = new JButton("红色");
        redBtn.addActionListener(this);
        redBtn.setFont(font1);
        blackBtn = new JButton("黑色");
        blackBtn.addActionListener(this);
        blackBtn.setFont(font1);
        whiteBtn = new JButton("白色");
        whiteBtn.addActionListener(this);
        whiteBtn.setFont(font1);
        blueBtn = new JButton("蓝色");
        blueBtn.addActionListener(this);
        blueBtn.setFont(font1);

        // add buttons to button panel
        buttonPanel.add(redBtn);
        buttonPanel.add(blackBtn);
        buttonPanel.add(whiteBtn);
        buttonPanel.add(blueBtn);

        // create popup menu and menu items
        popupMenu = new JPopupMenu();
        redItem = new JMenuItem("Red");
        redItem.addActionListener(this);
        redItem.setFont(font2);
        blackItem = new JMenuItem("Black");
        blackItem.addActionListener(this);
        blackItem.setFont(font2);
        whiteItem = new JMenuItem("White");
        whiteItem.addActionListener(this);
        whiteItem.setFont(font2);
        blueItem = new JMenuItem("Blue");
        blueItem.addActionListener(this);
        blueItem.setFont(font2);
        popupMenu.add(redItem);
        popupMenu.add(blackItem);
        popupMenu.add(whiteItem);
        popupMenu.add(blueItem);

        // add mouse listener to color panel to show popup menu on right-click
        colorPanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // change color based on button/menu item clicked
        JPanel colorPanel = (JPanel) getComponent(0);
        if (e.getSource() == redBtn || e.getSource() == redItem) {
            colorPanel.setBackground(Color.RED);
        } else if (e.getSource() == blackBtn || e.getSource() == blackItem) {
            colorPanel.setBackground(Color.BLACK);
        } else if (e.getSource() == whiteBtn || e.getSource() == whiteItem) {
            colorPanel.setBackground(Color.WHITE);
        } else if (e.getSource() == blueBtn || e.getSource() == blueItem) {
            colorPanel.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("实验五_作业一");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ColorPanel());
        frame.setSize(new Dimension(1000, 1000));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
