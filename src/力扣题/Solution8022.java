package 力扣题;

import java.util.HashMap;
import java.util.HashSet;

public class Solution8022 {
    HashSet<Long> hashSet = new HashSet<>();
    public long minimumPossibleSum(int n, int target) {
        if (n == 1) return 1;
        long m = 0;
        long size = 1;
        long result=0;
        while (m < n && size < target) {
            if (!hashSet.contains(target - size)) {
                hashSet.add(size);
                ++m;
                result+=size;
            }
            ++size;
        }
        while (m<n){
            result+=size;
            ++size;
            ++m;
        }
        return result;
    }
}
