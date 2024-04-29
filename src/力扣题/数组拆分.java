package 力扣题;

import java.util.Arrays;

public class 数组拆分 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int pointer=0;
        while (pointer<nums.length-1){
            sum+=nums[pointer];
            pointer+=2;
        }
        return sum;
    }
}
