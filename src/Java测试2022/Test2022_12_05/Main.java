package Test2022_12_05;

import java.util.Scanner;
public class Main {
    public static int dg(int x){
        if (x==1)
            return 1;
        else
        return dg(x-1)+x;
    }
    public static void main(String[] args) {
        System.out.println("请输入一个1-10000的数，它会自动求和");
        try {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            if (n>10000||n<1)
                System.out.println("输入的数不正确请重新输入");
            System.out.println(dg(n));
        }
       catch (StackOverflowError x){
           System.out.println("数太大了，请输入正确的数范围1-10000");
       }

    }
}
