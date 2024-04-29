package 力扣题;

import java.util.*;

public class Solution76 {
    Map<Character, Integer> tmap = new HashMap<>();
    Map<Character, Integer> smap = new HashMap<>();
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";

        for (int i = 0; i < t.length(); i++) {
            tmap.putIfAbsent(t.charAt(i),1);
            tmap.put(t.charAt(i),tmap.get(t.charAt(i))+1);
        }
        int l = 0, r = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();
        while (r < sLen) {
            ++r;
            if (r < sLen && tmap.containsKey(s.charAt(r))) {
                smap.put(s.charAt(r), smap.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (check() && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }
                if (tmap.containsKey(s.charAt(l))) {
                    smap.put(s.charAt(l), smap.getOrDefault(s.charAt(l), 0) - 1);
                }
                ++l;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }
    public boolean check(){
        Iterator iter = tmap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (smap.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;

    }
}
