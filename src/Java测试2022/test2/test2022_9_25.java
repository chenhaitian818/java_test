package test2;

import java.util.Scanner;

public class test2022_9_25 {
    public static void main(String[] args){
        System.out.print("请输入一个正整数:");
        Scanner sr=new Scanner(System.in);
        int n=sr.nextInt();
        int sum=autosum(n);
        System.out.println(sum);
    }
    public static int autosum(int n){
        int a;
        int sum2=1;
        for(a=1;a<=n;a++){
            sum2*=a;
        }
        return sum2;
    }
}
