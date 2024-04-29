package 蓝桥杯练习.题库;

import java.util.*;

public class 砝码称重 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int x = scan.nextInt();
        int[] sum = new int[x];
        for (int i = 0; i < x; i++) {
            sum[i] = scan.nextInt();
        }
        System.out.println(sz_number(x, sum));
        scan.close();
    }

    public static int sz_number(int x, int[] sum) {
        if (x == 1)
            return 1;

        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(0);
        for (int i = 0; i < x; i++) {
            //将set集合转化为list集合
            List<Integer> list = new ArrayList<>(hashSet);
            for (int k : list) {
                //将新的砝码与set集合的元素进行加减操作，得出新的砝码秤重

                hashSet.add(k + sum[i]);
                hashSet.add(Math.abs(k - sum[i]));

            }
        }
        hashSet.remove(0);
        return hashSet.size();
    }
}
