package Java高级编程.实验一;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 实验1 {
    public static void main(String[] args) {
        System.out.println("请输入1-100以内的被除数和除数");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("商等于:" + Quotient.quotient(scanner.nextFloat(), scanner.nextFloat()));
        } catch (InputMismatchException s) {
            System.out.println("输入的数据类型错误");
            s.printStackTrace();
        }

    }
}
