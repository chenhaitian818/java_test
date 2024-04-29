package 力扣题;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (Integer.bitCount(i) == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(Integer.bitCount(4));
    }

}
