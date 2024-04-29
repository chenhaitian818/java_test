package 力扣题;

public class Solution2027 {
    public static void main(String[] args) {
        String s="XXOX";
        System.out.println(minimumMoves(s));
    }
    public static int minimumMoves(String s) {
        int n = 0, i = 0;
        while (i<s.length()) {
            if (s.charAt(i) == 'X') {
                n++;
                i += 3;
            }else
                i++;
        }
        return n;
    }

}
