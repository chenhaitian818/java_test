package Java高级编程.实验六;

import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        String str = "BBQ very good";
        Map<Character, Integer> map = new HashMap<>();

        // 遍历字符串中的每个字符，统计它们出现的次数
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 输出每个字符和它出现的次数
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
