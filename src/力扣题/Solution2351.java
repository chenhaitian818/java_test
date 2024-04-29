package 力扣题;

public class Solution2351 {
    public char repeatedCharacter(String s) {
        int [] ss=new int [26];
        for (int i = 0; i < s.length(); i++) {
            ss[s.charAt(i)-'a']++;
            if (ss[s.charAt(i)-'a']==2)
                return s.charAt(i);
        }
        return 0;
    }
}
