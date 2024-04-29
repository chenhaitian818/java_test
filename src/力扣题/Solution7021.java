package 力扣题;

public class Solution7021 {
    public boolean canBeEqual(String s1, String s2) {
        int n=0;
        int len=s1.length();
        while (n<s1.length()){
            if (s1.charAt(n)!=s2.charAt(n)&&s1.charAt(n)!=s2.charAt((n+2)%len)) return false;
            ++n;
        }
        return true;
    }
}
