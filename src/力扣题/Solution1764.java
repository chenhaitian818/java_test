package 力扣题;

public class Solution1764 {
    public boolean canChoose(int[][] groups, int[] nums) {
        int nums1 = 0, nums2 = 0, groups2 = 0, i = 0;
        if (i == groups.length)
            return true;
        if (nums1 + groups[i].length > nums.length)
            return false;
        while (nums1 + groups[i].length <= nums.length) {
            if (groups[i][groups2] == nums[nums2]) {
                nums2++;
                groups2++;
            } else {
                nums1++;
                nums2 = nums1;
                groups2 = 0;
                break;
            }
            if (groups2 == groups[i].length) {
                i++;
                nums2++;
                nums1 = nums2;
                groups2 = 0;
                break;
            }
        }
        return false;
    }
}
