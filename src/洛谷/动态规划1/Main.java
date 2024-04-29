package 洛谷.动态规划1;

import java.util.*;
import java.io.*;

public class Main {
    public static int res=0,s=80112002;
    public static int[] rec;
    public static Map<Integer,List<Integer>> in=new HashMap<Integer,List<Integer>>();
    public static Map<Integer,List<Integer>> out=new HashMap<Integer,List<Integer>>();
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st=new StreamTokenizer(br);
        st.nextToken();
        int n=(int)st.nval;
        st.nextToken();
        int m=(int)st.nval;
        for(int i=1;i<=n;i++){
            in.put(i,new ArrayList<Integer>());  //吃谁
            out.put(i,new ArrayList<Integer>());   //被谁吃
        }
        for(int i=0;i<m;i++){
            st.nextToken();
            int beichi=(int)st.nval;
            st.nextToken();
            int chi=(int)st.nval;
            in.get(chi).add(beichi);
            out.get(beichi).add(chi);
        }
        rec=new int[n+1];
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=1;i<=n;i++){
            if(in.get(i).size()==0){
                rec[i]=1;
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int cur=q.poll();
            int size=out.get(cur).size();
            for(int i=0;i<size;i++){
                in.get(out.get(cur).get(i)).remove(new Integer(cur));
                rec[out.get(cur).get(i)]+=rec[cur];
                rec[out.get(cur).get(i)]=rec[out.get(cur).get(i)]%s;
                if(in.get(out.get(cur).get(i)).size()==0)
                    q.offer(out.get(cur).get(i));
                if(out.get(out.get(cur).get(i)).size()==0&&in.get(out.get(cur).get(i)).size()==0)
                    res=(res+rec[out.get(cur).get(i)])%s;
            }
        }

        System.out.println(res);
    }
}