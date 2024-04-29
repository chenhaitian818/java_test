package 力扣题;

public class Solution560 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,1};
        System.out.println(subarraySum(nums,0));
    }
        public static int subarraySum(int[] nums, int k) {
            int result=0;
            for (int head = 0; head < nums.length ; ++head) {
                int sums=0;
                for (int end = head; end >=0 ; --end) {
                    sums+=nums[end];
                    if (sums==k)
                        ++result;
                }
            }
            return result;
        }
}
