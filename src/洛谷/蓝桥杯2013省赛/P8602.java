package 洛谷.蓝桥杯2013省赛;

import java.io.*;
import java.util.*;

public class P8602 {
    static int[][] data = new int[100005][3];
    static int max_sum = 0;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max_dfs = dfs(1,0);
        System.out.println((11+(10+Math.max(max_dfs, max_sum)))/2*Math.max(max_dfs, max_sum));
    }

    public static int dfs(int now,int f) {
        int sign = 1, f_max = 0, s_max = 0;
        for (int i = f; i < n - 1; i++) {
            if (data[i][0] == now) {
                if (data[i][2] > f_max) {
                    f_max = data[i][2];
                    sign = data[i][1];
                }
                if (data[i][2] < f_max && data[i][2] > s_max) {
                    s_max = data[i][2];
                }
            }
            if (data[i][0] > now) {
                break;
            }
        }
        max_sum=Math.max(max_sum,f_max+s_max);
        if (sign==1) return 0;
        else return f_max + dfs(sign,1);
    }
}
