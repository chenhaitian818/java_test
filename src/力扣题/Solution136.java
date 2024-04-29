package 力扣题;

public class Solution136 {
    public int singleNumber(int[] nums) {
        int x=0;
        for (int i = 0; i < nums.length; i++) {
            x=x^nums[i];
        }
        return x;
    }
}
