package 洛谷.动态规划1;

import java.io.*;

public class P1115 {
    public static void main(String[] args) throws IOException {
        int max = -1000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int n = (int) st.nval;
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            sum += st.nval;
            arr[i]=(int)st.nval;
            if (sum>max){
                max=sum;
            }
            if (sum<=0 ){
                sum=0;
            }

        }
        System.out.println(max);
    }
}
