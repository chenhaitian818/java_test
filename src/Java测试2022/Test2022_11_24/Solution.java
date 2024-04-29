package Test2022_11_24;

public class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return Zj(nums, right) - Zj(nums, left-1);
    }

    private int Zj(int[] nums, int max) {
        int x = 0, z = 0;
        for (int y : nums) {
            z = y > max ? 0 : z + 1;
            x += z;
        }
        return x;
    }
}

