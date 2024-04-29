package Test2022_11_01;

import java.util.Scanner;

public class _10change2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int i;
        for (i = 1; ; i++) {
            if ((x % 2 ^ i) >= 0) {

            } else {
                i++;
                break;
            }

break;
        }System.out.println(i);
    }
}
