package 蓝桥杯练习.题库;

import java.sql.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 一百的阶乘 {
    public static void main(String[] args) {
        //在此输入您的代码...
        long x = 1L;
        int sum = 0;
        for (long i = 2L; i < 15L; i++) {
            x *= i;
        }
        for (long i = 1L; i <= x; i++) {
            if (x % i == 0) {
                ++sum;
            }
        }
        System.out.println(sum);
    }
}

