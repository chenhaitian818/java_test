package 第13届蓝桥杯JavaC组_2022_12_2;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = Math.abs(a - b);
        if (c == 0 || c == 1) {
            System.out.println("1");
        } else {
            System.out.println(Math.min((-a % c + c) % c, (-b % c + c) % c));
        }
    }
}

