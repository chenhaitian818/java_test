package 力扣题;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution239 {
    public static void main(String[] args) {
        int[] nums =new int[]{1,3,-1,-3,5,3,6,7};

        int[] ss=  maxSlidingWindow(nums, 3);
        for (int s:ss
             ) {
            System.out.println(s);
        }
    }
        public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null || nums.length< 2) return nums;
            LinkedList<Integer> queue = new LinkedList<>();
            int[] result =new int[nums.length-k+1];
            for (int i = 0; i < nums.length; i++) {
                while (!queue.isEmpty() && nums[queue.peekLast()]<=nums[i]){
                    queue.pollLast();
                }
                queue.addLast(i);
                if (!queue.isEmpty()&&queue.peek()<=i-k){
                    queue.poll();
                }
                if (!queue.isEmpty()&&i+1>= k){
                    result[i+1-k]=nums[queue.peek()];
                }
            }
            return result;
        }
}
