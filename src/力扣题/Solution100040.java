package 力扣题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution100040 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        System.out.println(countWays(nums));
    }

    public static int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int ans = 0;
        int max=0;
        int len=nums.size();
        int [] xz = new int[len];
        int[] arr = new int[len+1];
        for (int i = 0; i < len; i++) {
            xz[i] = i+1;
            arr[i] = nums.get(i);
            max = Math.max(max,nums.get(i));
        }
        arr[len]=1000000;
        Arrays.sort(arr);
        if (arr[0]>0)++ans;
        for (int i = 0; i < len; i++) {
            if (xz[i]>arr[i] && arr[i+1]>xz[i]) ++ans;
        }
        return ans;
    }
}
