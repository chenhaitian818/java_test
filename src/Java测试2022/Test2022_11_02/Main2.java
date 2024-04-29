package Test2022_11_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        {
            System.out.println("请输入一串大写字母");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            char[] arr = str.toCharArray();
            Map<Character, Character> map = new HashMap();
            for (int a = 0; a < arr.length; a++) {
                if (map.get(arr[a])!=null){
                    map.put(arr[a], (char) (map.get(arr[a])+1));
                }
                else {
                    map.put(arr[a], (char) 1);
                }
            }
        }
    }
}





