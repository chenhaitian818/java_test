package 力扣题;

import java.util.Collections;
import java.util.List;

public class Solution2861 {
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> Stock, List<Integer> Cost) {
        int ans = 0;
        int max = Collections.min(Stock) + budget;
        int[] stock = Stock.stream().mapToInt(i -> i).toArray();
        int[] cost = Cost.stream().mapToInt(i -> i).toArray();
        for (List<Integer> Com : composition) {
            int[] com = Com.stream().mapToInt(i -> i).toArray();
            int left = 0, right = max + 1;
            while (left + 1 < right) {
                int mid = (left + right) / 2;
                boolean ok = true;
                long money = 0;
                for (int i = 0; i < n; i++) {
                    if (stock[i] < (long) com[i] * mid) {
                        money += ((long) com[i] * mid - stock[i]) * cost[i];
                        if (money > budget) {
                            ok = false;
                            break;
                        }
                    }
                }
                if (ok) left = mid;
                else right = mid;
            }
            ans = Math.max(ans, left);
        }
        return ans;
    }
}
