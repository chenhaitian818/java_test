package 第13届蓝桥杯JavaC组_2022_12_2;

import java.util.Scanner;

 class D {
    public static  boolean Max(int[][] s,int i,int j){
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] s=new char[30][60];
        for (int i = 0; i < 30; i++) {
            String ss=scanner.next();
            s[i]=ss.toCharArray();
        }
        int sum=s[0][0];
        for (int i = 1; i < 29; i++) {
            for (int j = 1; j < 59; j++) {
                if (s[i][j-1]>s[i-1][j-1]){
                    sum+=s[i][j-1];
                }
            }
        }
    }
}
