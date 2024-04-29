package 蓝桥杯练习.题库;

import java.util.Arrays;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class 数位排序 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //在此输入您的代码...
            int x=scan.nextInt();
            int y=scan.nextInt();
            Integer[] sum=new Integer[x];
            for (int i = 0; i < x; i++) {
                sum[i]=i+1;
            }
            Arrays.sort(sum ,(o1,o2) -> sum(o1)!=sum(o2)? sum(o1)-sum(o2):o1-o2);
            System.out.println(sum[y-1]);
            scan.close();

        }
        public static int sum(int x){
            int res=0;
            while (x>0){
                res+=x%10;
                x/=10;
            }
            return res;
        }

}
