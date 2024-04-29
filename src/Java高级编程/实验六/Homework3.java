package Java高级编程.实验六;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("请输入字符串（输入 exit 结束）：");
        while (true) {
            String str = sc.nextLine();
            if ("exit".equals(str)) {
                break;
            }

            list.add(str);
        }

        System.out.println("排序前的列表：" + list);

        Collections.sort(list);  // 使用默认排序算法对列表进行排序

        System.out.println("排序后的列表：" + list);
    }
}
