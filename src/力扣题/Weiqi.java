package 力扣题;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Weiqi extends JFrame implements ActionListener {
  private int[][] board; // 棋盘上的状态，0表示空白，1表示黑子，2表示白子
  private int currentPlayer; // 当前玩家，1代表黑子，2代表白子
  private JButton[][] buttons; // 棋盘上的按钮
  private JLabel status; // 状态栏

  public Weiqi() {
    board = new int[19][19];
    currentPlayer = 1;
    buttons = new JButton[19][19];
    JPanel boardPanel = new JPanel(new GridLayout(19, 19));
    for (int i = 0; i < 19; i++) {
      for (int j = 0; j < 19; j++) {
        buttons[i][j] = new JButton();
        buttons[i][j].addActionListener(this);
        boardPanel.add(buttons[i][j]);
      }
    }
    status = new JLabel("轮到黑方下子");
    Container contentPane = getContentPane();
    contentPane.add(boardPanel, BorderLayout.CENTER);
    contentPane.add(status, BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    JButton button = (JButton)event.getSource();
    int row = -1, col = -1;
    for (int i = 0; i < 19; i++) {
      for (int j = 0; j < 19; j++) {
        if (button == buttons[i][j]) {
          row = i;
          col = j;
          break;
        }
      }
    }
    if (row == -1 || col == -1) {
      return;
    }
    if (board[row][col] != 0) {
      return;
    }
    board[row][col] = currentPlayer;
    if (currentPlayer == 1) {
      buttons[row][col].setBackground(Color.BLACK);
      status.setText("轮到白方下子");
    } else {
      buttons[row][col].setBackground(Color.WHITE);
      status.setText("轮到黑方下子");
    }
    checkWin(row, col);
    currentPlayer = 3 - currentPlayer;
  }

  private void checkWin(int row, int col) {
    int color = board[row][col];
    boolean[][] visited = new boolean[19][19];
    int count = dfs(row, col, color, visited, 1);
    if (count == 5) {
      if (color == 1) {
        status.setText("黑方获胜");
      } else {
        status.setText("白方获胜");
      }
      for (int i = 0; i < 19; i++) {
        for (int j = 0; j < 19; j++) {
          buttons[i][j].setEnabled(false);
        }
      }
    }
  }

  private int dfs(int row, int col, int color, boolean[][] visited, int count) {
    if (row < 0 || row >= 19 || col < 0 || col >= 19) {
      return 0;
    }
    if (visited[row][col]) {
      return 0;
    }
    if (board[row][col] != color) {
      return 0;
    }
    visited[row][col] = true;
    int ret = 0;
    ret += dfs(row - 1, col, color, visited, count + 1);
    ret += dfs(row + 1, col, color, visited, count + 1);
    ret += dfs(row, col - 1, color, visited, count + 1);
    ret += dfs(row, col + 1, color, visited, count + 1);
    return ret + 1;
  }

  public static void main(String[] args) {
    new Weiqi();
  }
}
