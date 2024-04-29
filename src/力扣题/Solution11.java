package 力扣题;


public class Solution11 {
    public int maxArea(int[] height) {
        int max = 0;
        int head = 0;
        int end = height.length - 1;
        while (head<end){
            max=Math.max(max,Math.min(height[head],height[end])*(end-head));
            if (height[head]<=height[end]){
                ++head;
            }else{
                --end;
            }
        }
            return max;
    }
}
