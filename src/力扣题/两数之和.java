package 力扣题;

public class 两数之和 {
    public int[] twoSum(int[] numbers, int target) {
        int head=0;
        int end=1;
        int[] result=new int[2];
        for (head = 0; head < numbers.length && head<end; head++) {
            for (end = head+1; end < numbers.length; end++) {
                if (numbers[head]+numbers[end]==target){
                    result[0]=head;
                    result[1]=end;
                    return result;
                }
            }
        }
        return result;
    }
}
