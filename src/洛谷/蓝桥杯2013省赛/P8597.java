package 洛谷.蓝桥杯2013省赛;

import java.io.*;

public class P8597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb1 = new StringBuilder(br.readLine());
        StringBuilder sb2 = new StringBuilder(br.readLine());
        int n = sb1.length() - 1;
        int[] arr = new int[n + 1];
        int sign = 0, result = 0;
        for (int i = 0; i <= n; i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                arr[i] = ++sign;
            } else arr[i] = 0;
        }
        int now = 1, i = 0;
        int left = -1, right = -1;
        while (now <= sign && i <= n) {
            if (arr[i] == now && now % 2 == 1) {
                left = i;
                ++now;
            }
            if (arr[i] == now && now % 2 == 0) {
                right = i;
                ++now;
            }
            if (left != -1 && right != -1) {
                result = result + right - left - 1;
                right = left = -1;
            }
            ++i;
        }
        if (sign % 2 == 1) System.out.println(result + (sign / 2) + 1);
        else System.out.println(result + (sign / 2));
    }
}
