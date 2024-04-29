package 洛谷.蓝桥杯2015省;

import java.util.*;
import java.io.*;

public class P8625test {
    static List<Integer>[] footprints;
    static long[] dp;
    static boolean[] check;
    static long max = Long.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        dp = new long[n + 1];
        check = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
        }

        footprints = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            footprints[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            footprints[one].add(two);
            footprints[two].add(one);
        }

        dfs(1);

        System.out.println(Math.max(max, 0));
    }

    static void dfs(int n) {
        check[n] = true;
        for (int next : footprints[n]) {
            if (!check[next]) {
                dfs(next);
                dp[n] += Math.max(0L, dp[next]);
                max = Math.max(max, dp[n]);
            }
        }
    }
}
