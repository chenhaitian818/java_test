package 蓝桥杯2022模拟二;

import java.util.Scanner;

public class II {
    public static boolean Xx(char[][] arr,int i,int j){
      return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        char[][]arr =new char[n][m];
        for (int i = 0; i < n; i++) {
            String s=scanner.next();
            arr[i]=s.toCharArray();
        }
        int x=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Xx(arr,i,j)){
                    x++;
                }
            }
        }
    }
}
