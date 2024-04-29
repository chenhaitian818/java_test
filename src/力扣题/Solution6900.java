package 力扣题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution6900 {
    public static void main(String[] args) {
        int[] nums =new int[]{5,5,5,5};
        System.out.println(countCompleteSubarrays(nums));
    }
    public static int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) set.add(x);
        int m = set.size();
        Map<Integer ,Integer> cnt = new HashMap<Integer, Integer>();
        int ans = 0, left = 0;
        for (int v : nums) {
            cnt.merge(v, 1, Integer::sum);
            while (cnt.size() == m) {
                int x = nums[left++];
                if (cnt.merge(x, -1, Integer::sum) == 0)
                    cnt.remove(x);
            }
            ans += left;
        }
        return ans;
    }

}
