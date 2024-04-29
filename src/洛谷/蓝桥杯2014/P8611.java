package 洛谷.蓝桥杯2014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P8611 {
    static int target;
    public static void main(String[] args) throws IOException {
        int left_1=0,left_0=0,right_1=0,right_0=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        target= Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n-1 ; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (Math.abs(now)<Math.abs(target)){
                if (now<0) ++left_0;
                else ++left_1;
            }else
            if (now<0) ++right_0;
            else ++right_1;
        }
        if (target<0 && left_1>0) System.out.println(left_1+right_0+1);
        if (target<0 && left_1==0) System.out.println(1);
        if (target>0 && right_0>0) System.out.println(left_1+right_0+1);
        if (target>0 && right_0==0) System.out.println(1);
    }
}
