package 剑指offer;

public class T3_2 {
    //    求0-i个连数字的二进制数中含有1的个数
    public int[] countBits(int num){
        int[] result = new int[num+1];
        for (int i = 1; i <=num ; i++) {
            result[i] = result[ i & (i-1)]+1;
        }
        return result;
    }
}
