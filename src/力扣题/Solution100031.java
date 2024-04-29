package 力扣题;

import java.util.ArrayList;
import java.util.List;

public class Solution100031 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);
        System.out.println(sumIndicesWithKSetBits(nums, 1));
    }

    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for (int i = 0; i < nums.size(); i++) {
            int ans=0;
            int help=i;
            while (help>0){
                if (help%2==1) ++ans;
                help=help>>1;
            }
            if (ans==k) sum+=nums.get(i);
        }
        return sum;
    }

}
