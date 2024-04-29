package 洛谷.蓝桥杯2015省;

import java.util.Scanner;

public class P8627 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=0;
        while (n>=3){
            int sign= 0 ;
            result=result+(n/3*3);
            sign=n/3+n%3;
            n=sign;
        }
        System.out.println(result+n);
    }
}
