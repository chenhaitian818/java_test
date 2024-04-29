/*
package 力扣题;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        System.out.println(canSplitArray(nums,3));
    }
    public class Solution3028 {

        public int returnToBoundaryCount(int[] nums) {
            int sign=0;
            int result=0;
            for (int i = 0; i < nums.length; i++) {
                sign+=nums[i];
                if (sign==0)
                    result++;
            }
            return result;
        }
    }


}
*/
