package 洛谷.动态规划1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.*;

public class P4017_BufferedReader {
    public static void main(String[] args) throws IOException {
        int result = 0,s=80112002;
        Map<Integer,ArrayList<Integer>> map_in = new HashMap<>();
        Map<Integer,ArrayList<Integer>> map_out = new HashMap<>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st=new StreamTokenizer(br);
        st.nextToken();
        int n=(int)st.nval;
        st.nextToken();
        int m=(int)st.nval;
        for(int i=1;i<=n;i++){
            map_in.put(i,new ArrayList<Integer>());  //吃谁
            map_out.put(i,new ArrayList<Integer>());   //被谁吃
        }
        for(int i=0;i<m;i++){
            st.nextToken();
            int beichi=(int)st.nval;
            st.nextToken();
            int chi=(int)st.nval;
            map_in.get(chi).add(beichi);
            map_out.get(beichi).add(chi);
        }
//        相当于储存到达当前节点有的多少条路径
        int[] sign = new int[n+1];
//        用一个队列来存储，进行dfs
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (map_in.get(i).size()==0){
                sign[i]=1;
                q.offer(i);
            }
        }
        while (!q.isEmpty()){
            int now_number = q.poll();
            int size = map_out.get(now_number).size();
            for (int i = 0; i < size; i++) {
                map_in.get(map_out.get(now_number).get(i)).remove(new Integer(now_number));
                sign[map_out.get(now_number).get(i)]+=sign[now_number];
                sign[map_out.get(now_number).get(i)]=sign[map_out.get(now_number).get(i)]%s;
                if (map_in.get(map_out.get(now_number).get(i)).size()==0){
                    q.offer(map_out.get(now_number).get(i));
                }
//                如果吃当前now_number的数他后续没有被吃，并且现在也没有吃的了答案就加上他
                if (map_out.get(map_out.get(now_number).get(i)).size()==0&&map_in.get(map_out.get(now_number).get(i)).size()==0){
                    result=(result+sign[map_out.get(now_number).get(i)])%s;
                }
            }
        }
        System.out.println(result);
    }
}
