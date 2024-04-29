package 洛谷.动态规划1;

import java.util.Scanner;

public class P1216 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int [][] arr = new int[1005][1005];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = r; i >=0 ; i--) {
            for (int j = 0; j <=i ; j++) {
                arr[i][j]=arr[i][j]+Math.max(arr[i+1][j],arr[i+1][j+1]);
            }
        }
        System.out.println(arr[0][0]);
    }
}
