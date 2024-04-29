package 蓝桥杯练习.第12届JavaA组;

import java.util.Arrays;

public class D {
    public static void main(String[] args) {
        long[] dp =new long[2022+5];
        Arrays.fill(dp,Long.MAX_VALUE);
        dp[1]=0;
        for (int i = 2; i <=2021 ; ++i) {
            for (int j = 1; j <=21 ; ++j) {
                if (i-j<=0)
                    break;
                dp[i]=Math.min(dp[i],dp[i-j]+lcm(i,i-j));
            }
        }
        System.out.println(dp[2021]);
    }

    public static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}