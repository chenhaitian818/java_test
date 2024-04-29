package Java高级编程.实验五;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class WeiqiGame extends JFrame {

    private JPanel controlPanel;
    private JButton blackButton, whiteButton, undoButton;
    private JPanel boardPanel;

    public WeiqiGame() {
        setTitle("围棋游戏");
        setSize(1500, 1500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        blackButton = new JButton("黑旗");
        whiteButton = new JButton("白旗");
        undoButton = new JButton("悔棋");

        controlPanel.add(blackButton);
        controlPanel.add(whiteButton);
        controlPanel.add(undoButton);

        boardPanel = new JPanel();
        boardPanel.setBackground(new Color(255,240,200));
        boardPanel.setPreferredSize(new Dimension(1000, 1000));

        boardPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println(e.getX() + ", " + e.getY());
            }
        });

        getContentPane().add(controlPanel, BorderLayout.NORTH);
        getContentPane().add(boardPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new WeiqiGame();
    }
}
