package 力扣题;

public class Solution2185 {
    public int prefixCount(String[] words, String pref) {
        int x = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>=pref.length()){
                for (int j = 0; j < pref.length(); j++) {
                    if (words[i].charAt(j)!=pref.charAt(j))
                        break;
                    if (j==pref.length()-1)
                        x++;
                }
            }
        }
        return x;
    }
}
