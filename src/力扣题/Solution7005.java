package 力扣题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution7005 {
    public static void main(String[] args) {
        String s1 = "abcdba", s2 = "cabdab";
        System.out.println(checkStrings(s1, s2));
    }

    public static boolean checkStrings(String s1, String s2) {
        int len = s1.length();
        // 统计s1中每个字符的出现次数
        int[] count_s1_1 = new int[26];
        for (int i = 1; i < len; i += 2) {
            count_s1_1[s1.charAt(i) - 'a']++;
        }
        int[] count_s1_2 = new int[26];
        for (int i = 0; i < len; i += 2) {
            count_s1_2[s1.charAt(i) - 'a']++;
        }

        // 统计s2中每个字符的出现次数
        int[] count_s2_1 = new int[26];
        for (int i = 1; i < len; i += 2) {
            count_s2_1[s2.charAt(i) - 'a']++;
        }
        int[] count_s2_2 = new int[26];
        for (int i = 0; i < len; i += 2) {
            count_s2_2[s2.charAt(i) - 'a']++;
        }

        // 判断字符出现次数是否均为偶数
        for (int i = 0; i < 26; i++) {
            if (count_s1_1[i] != count_s2_1[i] || count_s1_2[i] != count_s2_2[i]) {
                return false;
            }
        }

        return true;
    }
}

/*        Map<Integer,Character> map = new HashMap<>();
        char[] str1 = s1.toCharArray();
        int len = s1.length();
        int n = 0;
        for (int i = 0; i < len; i++) {
            map.put(i,s2.charAt(i));
        }
        while (n < len) {
            while (str1[n] != s2.charAt(n)) {
                if (map.containsValue(s2.charAt(n))&&map.)
                if (str1[help] == s2.charAt(n)) {
                    char help_char =' ';
                    help_char=str1[help];
                    str1[help]=str1[n];
                    str1[n]=help_char;
                    break;
                }
            }
            ++n;
        }
        return true;*/
