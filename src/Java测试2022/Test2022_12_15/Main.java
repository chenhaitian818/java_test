package Test2022_12_15;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1,1,1};
        System.out.println(minElements(nums, 1, 771843707));
    }

    public static int minElements(int[] nums, int limit, int goal) {
        double n = 0, c;
        for (int x : nums) {
            n += x;
        }
        while (n != goal) {
            c = Math.abs(goal - n);
            if ((c % limit) == 0)
                return (int) c / limit;
            return (int) c / limit + 1;
        }
        return 0;
    }
}