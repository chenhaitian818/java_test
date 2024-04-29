package 力扣题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


//这种写法理解错题意了换，我将它排序了，所以没找到最长的
public class Solution128 {
    public int longestConsecutive(int[] nums) {
/*        if (nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int[] help =new int[nums.length];
        help[0]=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]-1==nums[i-1]){
                help[i]=help[i-1]+1;
            }if (nums[i]==nums[i-1]){
                help[i]=help[i-1];
            }
        else{
                help[i]=1;
            }
        }
        int max=0;
        for (int m:help
             ) {
            max=Math.max(max,m);
        }
        return max;*/


        //另一种方法
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}