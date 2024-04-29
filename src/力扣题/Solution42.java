package 力扣题;

public class Solution42 {
    public static void main(String[] args) {
        int[] height = new int[]{2,0,2};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int head = 0, end = height.length - 1, limit = 0, result = 0;
        while (head < end) {
            while (((height[head] <= limit) || (height[end] <= limit)) && head < end) {
                if (height[head] > height[end]) {
                    --end;
                } else if (height[head] < height[end]) { // 使用 else if 来排除相等的情况
                    ++head;
                } else { // 当 height[head] == height[end] 时执行此分支
                    ++head;
                }
            }
            for (int z = head + 1; z < end; z++) {
                if (height[z] < Math.min(height[head], height[end])) {
                    result += Math.min(height[head], height[end]) - Math.max(limit , height[z]);
                }
            }
            limit = Math.min(height[head], height[end]);
            if (head < end) {
                if (height[head] > height[end]) {
                    --end;
                } else if (height[head] < height[end]) { // 使用 else if 来排除相等的情况
                    ++head;
                } else { // 当 height[head] == height[end] 时执行此分支
                    ++head;
                }
            }
        }
        return result;
    }
}
