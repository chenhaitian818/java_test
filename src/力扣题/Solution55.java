package 力扣题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution55 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        System.out.println(new Solution55().canJump(nums));
    }

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int right_max = 0;
        for (int i = 0; i < n; i++) {
            if (i <= right_max) right_max = Math.max(right_max, i + nums[i]);
            if (right_max>=n-1) return true;
        }
        return false;
    }
}
