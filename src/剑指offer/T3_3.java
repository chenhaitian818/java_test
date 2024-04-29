package 剑指offer;


public class T3_3 {
    //    求0-i个连数字的二进制数中含有1的个数
    public int[] countBits(int num){
        int[] result = new int[num+1];
        for (int i = 1; i <=num ; i++) {
            result[i] = result[ i >>1] + (i & 1);
        }
        return result;
    }
}
