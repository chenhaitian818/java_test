package 洛谷.动态规划1;

import java.util.Arrays;
import java.util.Scanner;

public class P1434 {
    static Scanner scan = new Scanner(System.in);
    static int R = scan.nextInt(), C = scan.nextInt();
    static int[][] numb = new int[R][C];
    static int[][] cpnumb = new int[R][C];

    public static void main(String[] args) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                numb[i][j] = scan.nextInt();
            }
        }
        int answer = 1;
        for (int i = 0; i < R; i++) {
            Arrays.fill(cpnumb[i], 1);
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                answer = Math.max(answer, dfs(i, j));
            }
        }
        System.out.println(answer);
    }

    static int dfs(int x, int y) {
        if (cpnumb[x][y] != 1) return cpnumb[x][y];//记忆化深度优先搜索
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            int xx = dx[i] + x;
            int yy = dy[i] + y;//四个方向
            if (xx >= 0 && yy >= 0 && xx < R && yy < C && numb[x][y] > numb[xx][yy]) {
                dfs(xx, yy);
                cpnumb[x][y] = Math.max(cpnumb[x][y], cpnumb[xx][yy] + 1);
            }
        }
        return cpnumb[x][y];
    }
}