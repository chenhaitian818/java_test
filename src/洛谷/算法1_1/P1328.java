package 洛谷.算法1_1;

import java.util.Scanner;

public class P1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Na = sc.nextInt();
        int Nb = sc.nextInt();
        int[] Na_arr = new int[Na];
        int[] Nb_arr = new int[Nb];
        for (int i = 0; i < Na; i++) {
            Na_arr[i] = sc.nextInt();
        }
        for (int i = 0; i < Nb; i++) {
            Nb_arr[i] = sc.nextInt();
        }
        int Now = 0;
        int A_win = 0;
        int B_win = 0;
        while (Now <= N - 1) {
            if (Na_arr[Now % Na] == Nb_arr[Now % Nb])
                ++Now;
            else {
//                这边可以拿一个二维数组来存，直接Na_arr和Nb_arr的Now取余位来代表坐标就行
                switch (Na_arr[Now % Na]) {
                    case 0:
                        switch (Nb_arr[Now % Nb]) {
                            case 1:
                                ++B_win;
                                ++Now;
                                break;
                            case 2:
                                ++A_win;
                                ++Now;
                                break;
                            case 3:
                                ++A_win;
                                ++Now;
                                break;
                            case 4:
                                ++B_win;
                                ++Now;
                                break;
                        }
                        break;
                    case 1:
                        switch (Nb_arr[Now % Nb]) {
                            case 0:
                                ++A_win;
                                ++Now;
                                break;
                            case 2:
                                ++B_win;
                                ++Now;
                                break;
                            case 3:
                                ++A_win;
                                ++Now;
                                break;
                            case 4:
                                ++B_win;
                                ++Now;
                                break;
                        }
                        break;
                    case 2:
                        switch (Nb_arr[Now % Nb]) {
                            case 0:
                                ++B_win;
                                ++Now;
                                break;
                            case 1:
                                ++A_win;
                                ++Now;
                                break;
                            case 3:
                                ++B_win;
                                ++Now;
                                break;
                            case 4:
                                ++A_win;
                                ++Now;
                                break;
                        }
                        break;
                    case 3:
                        switch (Nb_arr[Now % Nb]) {
                            case 0:
                                ++B_win;
                                ++Now;
                                break;
                            case 1:
                                ++B_win;
                                ++Now;
                                break;
                            case 2:
                                ++A_win;
                                ++Now;
                                break;
                            case 4:
                                ++A_win;
                                ++Now;
                                break;
                        }
                        break;
                    case 4:
                        switch (Nb_arr[Now % Nb]) {
                            case 0:
                                ++A_win;
                                ++Now;
                                break;
                            case 1:
                                ++A_win;
                                ++Now;
                                break;
                            case 2:
                                ++B_win;
                                ++Now;
                                break;
                            case 3:
                                ++B_win;
                                ++Now;
                                break;
                        }
                        break;
                }

            }
        }
        System.out.println(A_win + " " + B_win);
    }
}
