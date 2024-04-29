package Test2022_11_02;

public class Main3 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int i = 2022; i <= 2022222022; i++) {
            if (isPalindromeAndMonotonous(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }

    public static boolean isPalindromeAndMonotonous(int num) {
        char[] chs = ("" + num).toCharArray();
        int start = 0;
        int end = chs.length - 1;
        while (start < end) {
            if (chs[start] != chs[end] || chs[start] > chs[start + 1]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}