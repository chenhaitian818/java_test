/*
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class T7_1 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new LinkedList<>();
        if (nums.length >= 3){
            Arrays.sort(nums);

            int i = 0;
            while (i < nums.length - 2){

            }
        }
    }
    private void twoSum(int[] nums,int i,List<List<Integer>> result){
        int j= i+1;
        int k = nums.length-1;
        while (j<k){
            if (nums[i] + nums[j] + nums[k] == 0){
                result.add(Arrays.asList(nums[i],nums[j],nums[k]));
            }
        }
    }
}
*/
