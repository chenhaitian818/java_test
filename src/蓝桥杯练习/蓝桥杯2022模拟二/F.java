package 蓝桥杯2022模拟二;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int c=scanner.nextInt();
        int s=scanner.nextInt();
        double v=c/(1.0*t);
        int x=(int)((s-c)/v);
        System.out.println(x);
    }
}
