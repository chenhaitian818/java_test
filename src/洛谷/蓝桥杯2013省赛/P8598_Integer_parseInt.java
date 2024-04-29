package 洛谷.蓝桥杯2013省赛;

import java.io.*;

public class P8598_Integer_parseInt {
    public static void main(String[] args) throws IOException {
//        这一题的问题很简单主要是录入数据错了很多次，因为他一行数据并没有固定数量，导致无限录入
        int que = 0, cf = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[100005];
        int max = -1000000, min = 1000000;
        // 读取第一个整数
        int N = Integer.parseInt(br.readLine());
        // 读取N行数据
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] nums = line.split(" "); // 使用空格分隔字符串，得到每个数字的字符串数组

            for (String numStr : nums) {
                int n = Integer.parseInt(numStr); // 将字符串转换为整数
                // 在这里对每个数字进行处理
                max = Math.max(max, n);
                min = Math.min(min, n);
                arr[n] += 1;
            }
        }
        for (int i = min; i <= max; i++) {
            if (arr[i]==0) que=i;
            if (arr[i]==2) cf=i;
        }
        System.out.println(que+" "+cf);
    }
}
