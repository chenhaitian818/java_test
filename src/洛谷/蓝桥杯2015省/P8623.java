package 洛谷.蓝桥杯2015省;

import java.util.Scanner;

public class P8623 {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        int w = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = Math.abs(((m-1)/w)-((n-1)/w));
        if (((m-1)/w)%2==((n-1)/w)%2){
            System.out.println(x+Math.abs(((m-1)%w)-((n-1)%w)));
        }else {
            System.out.println(x+Math.abs(((m-1)%w)-Math.abs((n-1)%w-(w-1))));
        }
    }
}
