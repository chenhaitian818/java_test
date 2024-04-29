package 洛谷.算法1_1;

import java.util.Scanner;

public class P2670 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char[][] landmine = new char[a+2][b+2];
        int[][] results = new int[a+2][b+2];
        for (int i = 1; i <= a; i++) {
            String help = scanner.next();
            for (int j = 1; j <= b; j++) {
                landmine[i][j] = help.charAt(j-1);
            }
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (landmine[i][j] == '*'){
                    ++results[i+1][j];
                    ++results[i-1][j];
                    ++results[i][j+1];
                    ++results[i][j-1];
                    ++results[i+1][j+1];
                    ++results[i-1][j-1];
                    ++results[i+1][j-1];
                    ++results[i-1][j+1];
                }
            }
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (landmine[i][j] == '*'){
                    System.out.print(landmine[i][j]);
                }else{
                    System.out.print(results[i][j]);
                }
            }
            System.out.println();
        }
    }
}
