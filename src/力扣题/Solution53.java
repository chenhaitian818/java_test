package 力扣题;

public class Solution53 {
    public static void main(String[] args) {
        int[] nums =new int[]{1,2,-1,-2,2,1,-2,1,4,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
