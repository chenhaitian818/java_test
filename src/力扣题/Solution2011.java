package 力扣题;

public class Solution2011 {
    public int finalValueAfterOperations(String[] operations) {
        int n = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++"))
                n++;
            else if (operations[i].equals("--X") || operations[i].equals("X--"))
                n--;
        }

        return n;
    }
}
