package 洛谷.动态规划1;

import java.util.Scanner;

public class P2196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i]= sc.nextInt();
        }
        int[][] sign = new int[n][n];
        for (int i = n - 1; i > 0; --i) {
            for (int j = n - i; j < n; j++) {
                sign[n - i][j] = sc.nextInt();
            }
        }
//自底向上叠加
        for (int i = n - 1; i > 0; --i) {
            int max=0;
            for (int j =  i; j < n; j++) {
                if (sign[i][j]==1){
                    max=Math.max(max,value[j]);
                }
            }
            value[i-1]+=max;
        }
        int result_max=0;
//        输出最大的地雷
        int result_sign=0;
        for (int i = 0; i < n; i++) {
            if (value[i]>result_max){
            result_max=Math.max(result_sign,value[i]);
            result_sign=i+1;
            }
        }
        while (result_sign<=n){
            System.out.print((result_sign)+" ");
            int max=0;
            int help=0;
            for (int j = result_sign ; j < n; j++) {

                if (sign[result_sign][j]==1&&value[j]>max){
                    max=Math.max(max,value[j]);
                    help=j+1;
                }
            }
            if (help==0) break;
            result_sign=help;
        }
        System.out.println();
        System.out.println(result_max);

    }
}
