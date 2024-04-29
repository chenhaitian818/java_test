package 第13届蓝桥杯JavaC组_2022_12_2;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=b-a;
        System.out.println(c-(a%c));
    }
}
