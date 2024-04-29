package 蓝桥杯练习.第12届JavaA组;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(minfama(n));
    }
    public static int minfama(int s){
        int max=1,x=1,next_point=1;
        while (max<s){
            ++x;
            next_point=max*2+1;
            max+=next_point;
        }
        return x;
    }
}
