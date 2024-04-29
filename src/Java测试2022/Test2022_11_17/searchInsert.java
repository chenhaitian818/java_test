package Test2022_11_17;

public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                n-=1;
        }
        if(n<nums.length)
            n=nums.length;
        n=nums.length+1;
        int[]arr =new int[n];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            if(target==nums[i])
                return i;else
            if(nums[i]>target){
                arr[i]=target;
                return i;
            }
            if(arr[i]!=nums[i]){
                arr[i+1]=nums[i];
            }
        }return nums.length;
}
}
