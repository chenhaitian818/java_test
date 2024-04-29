package 第13届蓝桥杯JavaC组_2022_12_2;

import java.util.Arrays;
import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        n n = new n();
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[][] arr = new int[T][6];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < T; i++) {
            System.out.println(n.org(arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4], arr[i][5]));
        }
    }
}

class n {
    public int org(int a1, int b1, int a2, int b2, int a3, int b3) {
        int n = 8;
        int[] a = new int[]{a1, a2, a3};
        int[] b = new int[]{b1, b2, b3};
        Arrays.sort(a);
        Arrays.sort(b);
        if (a[0] + a[1] == a[2]) {
            n -= 2;
            if ((b[0] == b[1]) || (b[1] == b[2])) {
                n -= 2;
            }
        } else if (b[0] + b[1] == b[2]) {
            n -= 2;
            if ((a[0] == a[1]) || (a[1] == a[2])) {
                n -= 2;
            }
        } else if ((b[0] == b[1]) || (b[1] == b[2])) {
            n -= 2;
        } else if ((a[0] == a[1]) || (a[1] == a[2])) {
            n -= 2;
        } else if (b[0] == b[1] && b[0] == b[2]) {
            n -= 4;
        } else if (a[0] == a[1] && a[0] == a[2]) {
            n -= 4;
        }

        return n;
    }
}

