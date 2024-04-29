
package 洛谷.算法1_1;

import java.util.Scanner;

public class P1601_BigInteger {

    //    本题可以用bigInteger来解两行代码写完了
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int AC = 0;
        int a_len = a.length() - 1;
        int b_len = b.length() - 1;
        StringBuffer stringBuffer = new StringBuffer();
        while (a_len >= 0 && b_len >= 0) {
            stringBuffer.append((Character.getNumericValue(a.charAt(a_len)) + Character.getNumericValue(b.charAt(b_len)) + AC) % 10);
            if ((Character.getNumericValue(a.charAt(a_len)) + Character.getNumericValue(b.charAt(b_len)) + AC) >= 10) {
                AC = 1;
            } else {
                AC = 0;
            }
            --a_len;
            --b_len;
        }
        while (a_len >= 0 || b_len >= 0) {
            if (a_len >= 0) {
                stringBuffer.append((Character.getNumericValue(a.charAt(a_len)) + AC) % 10);
                if ((Character.getNumericValue(a.charAt(a_len)) + AC) >= 10) {
                    AC = 1;
                } else {
                    AC = 0;
                }
                --a_len;
            } else {
                stringBuffer.append((Character.getNumericValue(b.charAt(b_len)) + AC) % 10);
                if ((Character.getNumericValue(b.charAt(b_len)) + AC) >= 10) {
                    AC = 1;
                } else {
                    AC = 0;
                }
                --b_len;
            }
        }
        if (AC == 1) {
            stringBuffer.append(1);
        }
        System.out.println(stringBuffer.reverse());
    }
}
