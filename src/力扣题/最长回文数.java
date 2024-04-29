package 力扣题;

public class 最长回文数 {
    public String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            int x = s.length();
            int a = x - i;
            while (!if_palindromic_number(s.substring(a, x)) && a != 0) {
                a--;
                x--;
            }
            if (if_palindromic_number(s.substring(a, x)))
                return s.substring(a, x);
        }
        return "";
    }

    public Boolean if_palindromic_number(String s) {
        for (int i = 0; i <= (s.length()>>1)-1; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
