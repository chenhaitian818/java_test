package 蓝桥杯练习.第12届JavaA组;

public class C {
    static long[] val = new long[101000];
    static int total = 0;

    public static void main(String[] args) {

        long n = 2021041820210418L, r = (long) Math.sqrt(n);
        int total = 0;
        for (long i = 1; i <= r; i++) {
            if (n % i == 0) {
                val[++total] = i;
                val[++total] = n / i;
            }
        }
        long res = 0;
        for (int i = 1; i <= total; ++i) {
            for (int j = 1; j <= total; ++j) {
                if (n % (val[i] * val[j]) == 0)
                    ++res;
            }
        }
        System.out.println(res);
    }
}
