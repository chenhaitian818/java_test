package 蓝桥杯练习.题库;

import java.util.HashSet;
import java.util.Scanner;

public class 修改数组 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int x=scan.nextInt();
        int[] arr=new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=scan.nextInt();
        }
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i = 0; i < x; i++) {
            if (!hashSet.add(arr[i])){

            }
        }

        scan.close();
    }
}
