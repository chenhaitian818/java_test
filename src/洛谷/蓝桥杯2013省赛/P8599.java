package 洛谷.蓝桥杯2013省赛;

import java.util.Scanner;

public class P8599 {
    static int n, result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        quan(arr, 0);
        System.out.println(result);
    }

    public static void quan(int[] arr, int k) {
        if (k == 9) {
            check(arr);
        } else {
            for (int i = k; i < 9; i++) {
                int t = arr[i];
                arr[i] = arr[k];
                arr[k] = t;
                quan(arr, k + 1);
                t = arr[i];
                arr[i] = arr[k];
                arr[k] = t;
            }
        }
    }


    public static void check(int[] arr) {
        //控制a的最小位数和最大位数
        for (int i = 1; i <= 7; i++) {
            int a = toInt(arr, 0, i);
            if (a >= n) {
                continue;
            }
            //控制b和c的位数
            for (int j = 1; j <= 8 - i; j++) {
                int b = toInt(arr, i, j);
                int c = toInt(arr, i + j, 9 - i - j);
                if (b % c == 0 && a + b / c == n) {
                    result++;
                }
            }

        }
    }

    public static int toInt(int[] arr, int position, int length) {
        int t = 1;
        int answer = 0;
        for (int i = position + length - 1; i >= position; i--) {
            answer = answer + arr[i] * t;
            t *= 10;
        }
        return answer;

    }
}