package 力扣题;

public class Solution3028 {
    static int sign;
    static int result;
    public int returnToBoundaryCount(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            sign+=nums[i];
            if (sign==0)
                result++;
        }
        return result;
    }
}
