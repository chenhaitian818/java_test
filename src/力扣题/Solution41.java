package 力扣题;

public class Solution41 {
    public static void main(String[] args) {
        int [] nums = new int[]{1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i]<=0){
                nums[i]=n+1;
            }
        }
        for (int i = 0; i < n; i++) {
            int help = Math.abs(nums[i]);
            if (help<=n){
                nums[help-1]=-Math.abs(nums[help-1]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i]>0) return ++i;
        }
        return n+1;
    }
}
