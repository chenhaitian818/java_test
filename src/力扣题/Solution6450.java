package 力扣题;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution6450 {
    public static void main(String[] args) {
        System.out.println(minimumSum(3, 6));
    }
    public static int minimumSum(int n, int k) {
        if (n<Math.sqrt(k)){
            int result=0;
            for (int i = 1; i <= n; i++) {
                result+=i;
            }
            return result;
        }
        Deque<Integer> queue= new ArrayDeque<>();
        int size=1;
        int x=k;
        int result=0;
        while (x!=1){
            x=(int) Math.sqrt(x);
            queue.addLast(x);
        }
        int q_size=queue.size();
        while (size<=n && size<=q_size ){
            result=result+queue.removeLast();
            ++size;
        }
        while (size<=n){
            result=result+k;
            k++;
            ++size;
        }
        return result;
    }
}
