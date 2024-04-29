package 力扣题;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int head;
        int end;
        int help;
        end=nums.length-1;
        for (head = nums.length-1; head >=0 ; head--) {
            if (nums[head]==0){
                while (head<end){
                    help=nums[head+1];
                    nums[head+1]=nums[head];
                    nums[head]=help;
                    head++;
                }
                end--;
            }
        }
        for (int s:nums
             ) {
            System.out.println(s);
        }
    }
}
