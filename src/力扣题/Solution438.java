package 力扣题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int sL = s.length(), pL = p.length();

        if (sL < pL) {
            return new ArrayList<Integer>();
        }

        List<Integer> answer = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pL; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            answer.add(0);
        }

        for (int i = 0; i < sL - pL; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pL) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                answer.add(i + 1);
            }
        }

        return answer;
    }
}
