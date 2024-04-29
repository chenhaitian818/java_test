package Test2022_11_16;

public class five {
    public int pivotIndex(int[] nums) {
        int a=0;
        int b;
        for(int i=0;i<nums.length;i++){
            b=0;
            if(i>=1)
            a+=nums[i-1];
            if ((i==nums.length-1)&&(a==0))
                return i;
            for(int j=i+1;j<nums.length;j++){
                b+=nums[j];
                if((a==b)&&(j==nums.length-1))
                    return i;
            }
        }
        return -1;
    }
}
