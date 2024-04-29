package 洛谷.蓝桥杯2014;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P8612 {
    static int n, m, k;
    static int[][] data = new int[n][m];
    static int[][][][] cache =  new int[15][55][55][15];
    public static void main(String[] args) throws IOException {
//        读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        data = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int[][][] ints : cache) {
            for (int[][] anInt : ints) {
                for (int[] value : anInt) {
                    Arrays.fill(value, -1);
                }
            }
        }
        System.out.println(dp(-1,0,0,0));
    }

    public static int dp(int max, int xx, int yy,int size) {
        if (xx==n ||yy==m) return 0;
        if (cache[max+1][xx][yy][size]!=-1) return cache[max+1][xx][yy][size];
        int res=0;
        if (xx==n-1&&yy==m-1){
            if (size==k||size==k-1&&data[xx][yy]>max) ++res;
        }else{
            res+= dp(max,xx,yy+1,size);
            if (data[xx][yy]>max){
                res += dp(data[xx][yy],xx,yy+1,size+1);
            }
            res+= dp(max,xx+1,yy,size);
            if (data[xx][yy]>max){
                res += dp(data[xx][yy],xx+1,yy,size+1);
            }
        }
        cache[max+1][xx][yy][size] = res%1000000007;
        return cache[max+1][xx][yy][size];
    }
}
