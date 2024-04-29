package Java高级编程.实验六;

import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        Map<String, List<String>> sports = new HashMap<>();
        sports.put("田径比赛", Arrays.asList("张三", "李四", "王五"));
        sports.put("篮球比赛", Arrays.asList("李四", "赵六", "孙七"));
        sports.put("足球比赛", Arrays.asList("张三", "王五", "赵六"));

        Set<String> students = new HashSet<>();
        for (List<String> list : sports.values()) {
            students.addAll(list);
        }

        int total = students.size();

        System.out.println("班级参加比赛的人数为：" + total + "人");
    }
}
