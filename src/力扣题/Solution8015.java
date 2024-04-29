package 力扣题;

public class Solution8015 {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int add = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (moves.charAt(i) == '_') ++add;
            if (moves.charAt(i) == 'L') ++result;
            if (moves.charAt(i)=='R')--result;
        }
        return Math.abs(result)+add;
    }
}
