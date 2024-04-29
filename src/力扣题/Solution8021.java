package 力扣题;

import java.util.Arrays;
import java.util.List;

public class Solution8021 {

    public int minOperations(List<Integer> nums, int target) {
        int n = nums.size();
        double[] num = new double[n];
        Arrays.sort(num);
        double sum = 0;
        int i = 0;
        int result=1;
        while (i < n-1 && (sum + num[i]) < target) {
            sum += num[i];
            ++i;
        }
        while (num[i]%(target-sum)==0){
            if (sum+num[i]==target) return result;
            ++result;
            num[i]/=2;
        }
        return -1;
    }
}
