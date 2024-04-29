package 洛谷.蓝桥杯2015省;

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main implements Runnable{

    static int status;
    static BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static PrintWriter court = new PrintWriter(bw);
    static StreamTokenizer st = new StreamTokenizer(buf);

    public static int nextInt() throws IOException {
        status = st.nextToken();
        return (int) st.nval;
    }


    static int n;
    static int cnt=0;
    static int[] head;
    static int[] w;
    static long[] f;
    static Edge[] e;

    public static void main(String[] args) throws IOException {
        new Thread(null,new Main(),"",1<<29).start();
    }// End of main

    public void run(){
        try{
            n = nextInt();
            head = new int[n + 1];
            w = new int[n + 1];
            f = new long[n + 1];
            e = new Edge[2*n + 1];

            Arrays.fill(head,-1);
            for(int i=1;i<=n;i++)
                w[i] = nextInt();
            for(int i=1;i<=n-1;i++){
                int u = nextInt(),v = nextInt();
                add(u, v, 0);add(v, u, 0);
            }
            dfs(1,-1);
            long ans=0;
            for(int i=1;i<=n;i++)
                ans=max(ans,f[i]);
            court.println(ans);
            court.flush();
        }catch(Exception ignored){}
    }

    public static void dfs(int u,int fa){
        f[u]=w[u];
        for(int i=head[u];i!=-1;i=e[i].next){
            int v = e[i].v;
            if(v==fa) continue;
            dfs(v,u);
            f[u]+=max(f[v],0);
        }
    }

    public static void add(int u,int v,int c){
        ++cnt;
        e[cnt]=new Edge(v,c,head[u]);
        head[u]=cnt;
    }

    static class Edge{
        int v,c,next;
        public Edge(int v,int c,int next){
            this.v = v;
            this.c = c;
            this.next = next;
        }
    }
}