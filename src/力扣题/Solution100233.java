package 力扣题;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution100233 {
    static int sum_apple=0;
    static int answer=0;

    public static void main(String[] args) {
        int [] apple={5,5,5};
        int [] capacity={2,4,2,7};
        System.out.println(minimumBoxes(apple,capacity));
    }
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int help=capacity.length-1;
        Arrays.sort(capacity);
        for (int i = 0; i < apple.length; i++) {
            sum_apple+=apple[i];
        }
        while (sum_apple>0){
            sum_apple-=capacity[help];
            help--;
            answer++;
        }
        return answer;
    }
}
