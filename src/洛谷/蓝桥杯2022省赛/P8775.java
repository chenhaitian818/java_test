package 洛谷.蓝桥杯2022省赛;

import java.io.*;

public class P8775 {
    public static void main(String[] args) throws IOException {
        int n, t, ans = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        n = (int) st.nval;
        st.nextToken();
        t=((int)st.nval)*2;
        int[] arr = new int[n+5];
        for (int i = 1; i < n ; i++) {
            st.nextToken();
            arr[i]=(int)st.nval;
        }
        for(int i=1,j=0,sum=0;i<n;++i) {
            while(j<n&&sum<t) sum+=arr[++j];
            ans=Math.max(ans,j-i+1);
            sum-=arr[i];
        }
        System.out.println(ans);
    }
}
