package 力扣题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int []> list = new ArrayList<>();
        return intervals;
    }
}
