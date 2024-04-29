package 力扣题;

public class Solution1806 {
    public static void main(String[] args) {
        System.out.println(reinitializePermutation(6));
    }

    public static int reinitializePermutation(int n) {
        if (n == 2)
            return 1;
        int x = 1, y = 3;
        while (y != 2) {
            x++;
            y = (y<=(n/2)) ? y * 2 - 1 : y * 2 - n;
        }
        return x;
    }
}

