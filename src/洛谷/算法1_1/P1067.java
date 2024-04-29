package 洛谷.算法1_1;

import java.util.*;

public class P1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
//        先把所以拼接起来，到最后再把首尾删掉
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= n; i++) {
            if (arr[i] >= 1) {
                if (arr[i] == 1 && n - i > 1) sb.append("+").append("x^").append(n - i);
                if (arr[i] == 1 && n - i == 0) sb.append("+").append(arr[i]).append("x^").append(0);
                if (arr[i] == 1 && n - i == 1) sb.append("+").append("x");
                if (arr[i] != 1 && n - i == 1) sb.append("+").append(arr[i]).append("x");
                if (arr[i] != 1 && n - i > 1) sb.append("+").append(arr[i]).append("x^").append(n-i);
                if (arr[i] != 1 && n - i == 0) sb.append("+").append(arr[i]).append("x^").append(0);
            }
            if (arr[i] <= -1) {
                if (arr[i] == -1 && n - i > 0) sb.append("-").append("x^").append(n - i);
                if (arr[i] == -1 && n - i == 0) sb.append(arr[i]).append("x^").append(0);
                if (arr[i] == -1 && n - i == 1) sb.append("-x");
                if (arr[i] != -1 && n - i == 1) sb.append(arr[i]).append("x");
                if (arr[i] != -1 && n - i > 1) sb.append(arr[i]).append("x^").append(n-i);
                if (arr[i] != -1 && n - i == 0) sb.append(arr[i]).append("x^").append(0);
            }
        }
        if (sb.length() == 0) System.out.println(0);
        else {
            if (sb.charAt(0) == '+' && sb.charAt(sb.length() - 1) == '0')
                System.out.println(sb.subSequence(1, sb.length() - 3));
            if (sb.charAt(0) == '+' && sb.charAt(sb.length() - 1) != '0')
                System.out.println(sb.subSequence(1, sb.length()));
            if (sb.charAt(0) == '-' && sb.charAt(sb.length() - 1) == '0')
                System.out.println(sb.subSequence(0, sb.length() - 3));
            if (sb.charAt(0) == '-' && sb.charAt(sb.length() - 1) != '0')
                System.out.println(sb.subSequence(0, sb.length()));
        }
    }
}
