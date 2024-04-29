package 洛谷.动态规划1;

import java.util.Scanner;

public class P1048 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[M][2];
        int dp[] = new int[T+5];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i <M ; i++) {
            for (int j = T; j >= 0; j--) {
                if (j>=arr[i][0]){
                    dp[j]=Math.max(dp[j-arr[i][0]]+arr[i][1],dp[j]);
                }else break;
            }
        }
        System.out.println(dp[T]);
    }
}
