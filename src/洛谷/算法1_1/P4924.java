package 洛谷.算法1_1;

import java.util.Scanner;

public class P4924 {
    static int[][] arr = new int[510][510];
    static int[][] help = new int[510][510];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] cmd = new int[m][4];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 4; j++) {
                cmd[i][j] = scanner.nextInt();
            }
        }
        int arr_int = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = arr_int;
                ++arr_int;
            }
        }
        for (int i = 0; i < m; i++) {
            if (cmd[i][3] == 0) {
                right(cmd[i][0]-1, cmd[i][1]-1, cmd[i][2]);
            } else {
                left(cmd[i][0]-1, cmd[i][1]-1, cmd[i][2]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void right(int x, int y, int r) {
        for (int j = y + r; j >= y - r; --j) {
            for (int i = x - r; i <= x + r; i++) {
                help[i][j] = arr[2*y - j][i];
            }
        }
        for (int i = x - r; i <= x + r; i++) {
            for (int j = y - r; j <= y + r; j++) {
                arr[i][j] = help[i][j];
            }
        }
    }

    public static void left(int x, int y, int r) {
        for (int j = y - r; j <= y + r; j++) {
            for (int i = x + r; i >= x - r; --i) {
                help[i][j] = arr[j][2*x - i];
            }
        }
        for (int i = x - r; i <= x + r; i++) {
            for (int j = y - r; j <= y + r; j++) {
                arr[i][j] = help[i][j];
            }
        }
    }
}
