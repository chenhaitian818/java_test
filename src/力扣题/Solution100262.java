package 力扣题;

public class Solution100262 {
    public int sumOfEncryptedInt(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];int maxDigit = 0;int b_number=0;
            while (number >= 10) {
                int digit = number % 10; // 获取当前最低位的数字
                b_number++;
                maxDigit = Math.max(maxDigit, digit);
                number /= 10; // 移除当前最低位
            }
            maxDigit=Math.max(maxDigit,number);
            if (b_number>=1){
                int sum=0;
                int help=maxDigit;
                sum+=maxDigit;
                while (b_number>0){
                    help*=10;
                    sum+=help;
                    b_number--;
                }
            answer=answer+sum;
            }else {
                answer=answer+number;
            }
        }
        return answer;
    }
}