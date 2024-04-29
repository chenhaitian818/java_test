package 洛谷.蓝桥杯2013省赛;

import java.io.*;
import java.util.*;
//想出来的一种输出对抗dfs的
/*      3 3
        1 1 1
        8 1 1
        1 1 1*/
public class P8601 {
    static int answer = 1000, sum = 0;
    static int[][] b = {{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
    static int m,n;
    static int[][] data = new int[15][15];
    static int[][] dfs = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        用StringTokenizer逐行来拿BufferedReader的数据
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int help = Integer.parseInt(st.nextToken());
                data[i][j] = help;
                sum+=help;
            }
        }
        if (sum%2==1) System.out.println(0);
        else{
            for (int i = 0; i < m; i++) {
                for (int[] s:dfs
                     ) {
                    Arrays.fill(s,0);
                }
                dfs[0][i]=1;
                dfs(0,0,data[0][i],1,0);
            }
        System.out.println(answer);}
    }
    public static void dfs(int x,int y,int now,int ans,int c){
        if (dfs[0][0]==1&&now==sum/2) answer=Math.min(ans,answer);
        if (now<sum/2){
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                List<Integer> list1 =new ArrayList<>();
                int xx=x+b[i][0],yy=y+b[i][1];
                if (xx<0||xx>n-1||yy<0||yy>m-1||dfs[xx][yy]==1||now+data[xx][yy]>sum/2) continue;
                list1.add(xx);
                list1.add(yy);
                list.add(list1);
                dfs[xx][yy]=1;
                dfs(xx,yy,now+data[xx][yy],ans+1,i);
                if (i!=3) return;
            }
            for (int i = 0; i < list.size(); i++) {
                dfs[list.get(i).get(0)][list.get(i).get(0)]=0;
            }
        }
    }
}
