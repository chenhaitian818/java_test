package 剑指offer;

public class T3_1 {
//    求0-i个连数字的二进制数中含有1的个数
    public int[] countBits(int num){
        int[] result = new int[num+1];
        for (int i = 0; i <=num ; i++) {
            int j = i;
            while (j!=0){
                result[i]++;
                j = j & (j-1);
            }
        }
        return result;
    }
}
