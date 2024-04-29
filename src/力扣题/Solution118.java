package 力扣题;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> integerList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i)integerList.add(1);
                else integerList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            list.add(integerList);
        }
        return list;
    }
}
