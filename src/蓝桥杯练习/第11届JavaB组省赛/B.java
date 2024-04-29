package 蓝桥杯练习.第11届JavaB组省赛;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        int[][] t_z = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    t_z[i][j] = 2;
                } else {
                    t_z[i][j] = 0;
                }
            }
        }
        for (int[] ss : t_z
        ) {
            for (int s : ss
            ) {
                System.out.print(s);
            }
            System.out.println();
        }
        int result = 0;
        for (int i = 0; i <= 7 - 3; i++) {
            for (int j = 0; j <= 7 - 3; j++) {
//                当前进入节点为2
                if (t_z[i][j] == 2) {
//                    往右走第2个节为0
                    if (t_z[i][j + 1] == 0 && t_z[i][j + 2] == 2 && t_z[i][j + 3] == 0) {
                        ++result;
                    }
//                                        往右下走第2个节为0
                    if (t_z[i + 1][j + 1] == 0 && t_z[i + 2][j + 2] == 2 && t_z[i + 3][j + 3] == 0) {
                        ++result;
                    }
//                                        往下走第2个节为0
                    if (t_z[i + 1][j] == 0 && t_z[i + 2][j] == 2 && t_z[i + 3][j] == 0) {
                        ++result;
                    }
                }
            }
        }
        for (int i = 0; i <= 7-3 ; i++) {
            for (int j = 5; j <=7 ; j++) {
                if (t_z[i][j] == 2) {
//                                        往下走第2个节为0
                    if (t_z[i + 1][j] == 0 && t_z[i + 2][j] == 2 && t_z[i + 3][j] == 0) {
                        ++result;
                    }
                }
            }
        }
        for (int i = 5; i <= 7 ; i++) {
            for (int j = 0; j <=7-3 ; j++) {
                if (t_z[i][j] == 2) {
//                    往右走第2个节为0
                    if (t_z[i][j + 1] == 0 && t_z[i][j + 2] == 2 && t_z[i][j + 3] == 0) {
                        ++result;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
