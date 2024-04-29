package 力扣题;

import java.util.Arrays;

public class Solution100247 {
    public static void main(String[] args) {
        int[] happiness={1,1,1,1} ;
        int k =2;
        System.out.println(maximumHappinessSum(happiness,k));
    }
    static long answer=0;
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        for (int i = happiness.length-1; i >happiness.length-1-k ; i--) {
            long now_happiness=happiness[i]- (happiness.length-1-i);
            if (now_happiness>0){
                answer+=now_happiness;
            }
        }
        return answer;
    }
}
