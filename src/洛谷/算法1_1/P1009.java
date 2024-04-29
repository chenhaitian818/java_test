package 洛谷.算法1_1;

import java.math.BigInteger;
import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger bigMath = new BigInteger("1");
        BigInteger result= new BigInteger("0");
        for (int i = 1; i <= n; i++) {
            bigMath=bigMath.multiply(new BigInteger(String.valueOf(i)));
            result = result.add(bigMath);
        }
        System.out.println(result);
    }
}
