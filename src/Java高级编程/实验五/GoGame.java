package Java高级编程.实验五;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GoGame extends JFrame implements ActionListener {

    private JPanel boardPanel;
    private JButton blackBtn, whiteBtn, regretBtn;
    private JLabel statusLabel;
    private int[][] board; // 2D array to represent board positions
    private int player; // 1 for BLACK, -1 for WHITE
    private final int EMPTY = 0; // empty position on board
    private final int BLACK = 1;
    private final int WHITE = -1;
    private boolean gameOver;

    public GoGame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 1500);
        setTitle("Go Game");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // create panel for buttons and add to top of main panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        mainPanel.add(buttonPanel, BorderLayout.NORTH);

        // create buttons
        blackBtn = new JButton("Black");
        blackBtn.addActionListener(this);
        whiteBtn = new JButton("White");
        whiteBtn.addActionListener(this);
        regretBtn = new JButton("Regret");
        regretBtn.addActionListener(this);

        // add buttons to button panel
        buttonPanel.add(blackBtn);
        buttonPanel.add(whiteBtn);
        buttonPanel.add(regretBtn);

        // create label for game status messages and add to bottom of main panel
        statusLabel = new JLabel("BLACK's turn");
        statusLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(statusLabel, BorderLayout.SOUTH);

        // create panel for game board and add to center of main panel
        boardPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int x, y;
                for (int i = 0; i < 19; i++) {
                    x = i * 40;
                    y = (18 - i) * 40;
                    g.setColor(Color.BLACK);
                    g.drawLine(x, 0, x, 720);
                    g.drawLine(0, y + 40, 720, y + 40);
                }
            }
        };
        boardPanel.setPreferredSize(new Dimension(720, 720));
        boardPanel.setBackground(new Color(156, 95, 41));
        mainPanel.add(boardPanel, BorderLayout.CENTER);

        // initialize board positions with EMPTY values
        board = new int[19][19];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = EMPTY;
            }
        }

        // add mouse listener to board panel to handle player clicks
        boardPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!gameOver) {
                    int row = e.getY() / 40;
                    int col = e.getX() / 40;
                    if (isValidMove(row, col)) {
                        placeStone(row, col);
                        updateBoardDisplay();
                        checkForWinner();
                        changePlayer();
                    }
                }
            }

            public void mouseMoved(MouseEvent e) {
                if (!gameOver) {
                    int row = e.getY() / 40;
                    int col = e.getX() / 40;
                    if (isValidMove(row, col)) {
                        Graphics g = boardPanel.getGraphics();
                        g.setColor(Color.RED);
                        g.drawRect(col * 40, row * 40, 40, 40);
                    }
                }
            }

            public void mouseExited(MouseEvent e) {
                if (!gameOver) {
                    updateBoardDisplay();
                }
            }
        });

        // initialize current player to BLACK
        player = BLACK;
        gameOver = false;

        add(mainPanel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == blackBtn) {
            player = BLACK;
            statusLabel.setText("BLACK's turn");
        } else if (e.getSource() == whiteBtn) {
            player = WHITE;
            statusLabel.setText("WHITE's turn");
        } else if (e.getSource() == regretBtn) {
            // TODO: handle regret button click
        }
    }

    private boolean isValidMove(int row, int col) {
        return board[row][col] == EMPTY;
    }

    private void placeStone(int row, int col) {
        board[row][col] = player;
    }

    private void updateBoardDisplay() {
        Graphics g = boardPanel.getGraphics();
        for (int r = 0; r < board.length; r++){
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == BLACK) {
                    g.setColor(Color.BLACK);
                    g.fillOval(c * 40, r * 40, 40, 40);
                } else if (board[r][c] == WHITE) {
                    g.setColor(Color.WHITE);
                    g.fillOval(c * 40, r * 40, 40, 40);
                    g.setColor(Color.BLACK);
                    g.drawOval(c * 40, r * 40, 40, 40);
                } else {
                    g.setColor(new Color(156, 95, 41));
                    g.fillRect(c * 40, r * 40, 40, 40);
                }
            }
        }
    }

    private void checkForWinner() {
        // TODO: implement win/lose logic
    }

    private void changePlayer() {
        player = -player;
        if (player == BLACK) {
            statusLabel.setText("BLACK's turn");
        } else {
            statusLabel.setText("WHITE's turn");
        }
    }

    public static void main(String[] args) {
        new GoGame();
    }
}
