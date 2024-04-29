/*
package 力扣题;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution6989 {
    Map<Integer,Integer> map = new HashMap<>();
    public long m0axSum(List<Integer> nums, int m, int k) {
        int sum=0;
        int result=0;
        for (int i = 0; i < k; i++) {
            if (map.containsKey(nums.get(i))) {
                // 如果存在，将对应的 value 加 1
                int value = map.get(nums.get(i));
                map.put(nums.get(i), value + 1);
            } else {
                // 如果不存在，设置 key 对应的 value 为 1
                map.put(nums.get(i), 1);
            }
            sum+=nums.get(i);
        }
        int head=1,end=k;
        while (end<nums.size()){
            if ()
        }
        return 0;
    }
}
*/
