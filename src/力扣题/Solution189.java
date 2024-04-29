package 力扣题;

import java.lang.System;
import java.util.*;

public class Solution189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newarr = new int[n];
        for (int i = 0; i < nums.length; i++) {
            newarr[(i + k) % n] = nums[i];
        }
        System.arraycopy(newarr,0,nums,0,n);
    }

}
