package 力扣题;

import java.util.*;

public class Solution8029 {
    Set<Integer> set = new HashSet<>();
    int min,max;
    public int numberOfPoints(List<List<Integer>> nums) {
        for (int i = 0; i < nums.size(); i++) {
            min=nums.get(i).get(0);
            max=nums.get(i).get(1);
            for (int j = min; j <= max; j++) {
                set.add(j);
            }
        }
        return set.size();
    }
}
