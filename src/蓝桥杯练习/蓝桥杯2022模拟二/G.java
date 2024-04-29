package 蓝桥杯2022模拟二;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s=scanner.next();
            if (!list.contains(s))
                list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
