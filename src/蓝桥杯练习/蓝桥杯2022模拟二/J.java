package 蓝桥杯2022模拟二;

import java.util.Scanner;

public class J {

    static int x=0;
    public static void h(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            for (int j=0; j<a.length-i-1; j++) {
                if(a[j]>a[j+1]) {
                    x+=a[j];
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        h(a);
        System.out.println(x);
    }
}
