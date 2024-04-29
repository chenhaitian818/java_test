package 力扣题;

public class Solution100248 {
    public static void main(String[] args) {
        System.out.println(isSubstringPresent("leetcode"));
    }
    public static boolean isSubstringPresent(String s) {
        int length = s.length();
        if (length==1)return false;
        String f = "";
        String l = "";
        for (int i = 1; i < length; i++) {
            f=s.substring(i-1,i+1);
            for (int j = 1; j < length; j++) {
                l=s.substring(length-j-1,length-j+1);
                if (f.charAt(0)==l.charAt(1)&&f.charAt(1)==l.charAt(0))return true;
            }

        }
        return false;
    }
}
