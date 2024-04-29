package 力扣题;

import java.util.List;

public class Solution7004 {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size()!=s.length()) return false;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0)!=s.charAt(i))return false;
        }
        return true;
    }
}
