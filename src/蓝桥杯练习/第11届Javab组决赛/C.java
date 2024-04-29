package 蓝桥杯练习.第11届Javab组决赛;

import java.util.HashSet;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        Set<Integer> tempSet = new HashSet<Integer>(); // 用于临时存放要添加的元素
        for (int i = 2; i <= 100; ++i) {
            for (int s : set) {
                tempSet.add(s*i); // 将要添加的元素先放入临时集合
            }
            set.addAll(tempSet); // 遍历结束后，将临时集合中的元素一次性添加到set中
            tempSet.clear(); // 清空临时集合
        }
        System.out.println(set.size());
    }
}
