package 力扣题;

import java.util.List;

public class Solution2862 {
    public long maximumSum(List<Integer> nums) {
        long ans = 0;
        int n = nums.size();
        long[] sum = new long[n+1];
        for (int i = 0; i <n ; i++) {
            int now = real(i+1);
            sum[now] += nums.get(i);
            ans=Math.max(ans,sum[now]);
        }
        return ans;
    }
    int real(int n){
        int res=1;
        for (int i = 2; i*i <=n ; i++) {
            int j_o=0;//判断是不是完全平方数（如果是奇数说明不是，如果是偶数说明是，下面用异或来减少判断）
            while (n%i==0){
                j_o ^=1;//这里异或1（如果执行次数是奇数次j_o就是1是偶数次就是0）
                n /=i;
            }
            if (j_o==1){
                res*=i;//如果是偶数说明不是完全平方数咯，或是res*i*(i*i)2n次方所以结果呢就是res*i
            }
        }
        if (n>1){
            res*=n;
        }
        return  res;
    }
    public long maximumSum2(List<Integer> nums) {
            long ans = 0;
            int n = nums.size(); // 获取链表的长度
            for (int i = 1; i <= n; i++) {
                long sum = 0;
                for (int j = 1; i * j * j <= n; j++) {
                    sum += nums.get(i * j * j - 1); // 使用链表的 get 方法获取元素
                }
                ans = Math.max(ans, sum);
            }
            return ans;
        }
}
