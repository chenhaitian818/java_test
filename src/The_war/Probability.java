package The_war;

import java.util.Random;

public class Probability {
    static double[] probability1 = new double[]{0,1,1,1,1};
    static double[] probability2 = new double[]{0,0};
    static double sum_result = 0;
    static double times=10000;
    static double result = 0;//记录结果
    static int randomZeroToOne;
    static int randomZeroToFour;
    public static void main(String[] args) {
        while (times>0) {
            Random rand = new Random();
            randomZeroToOne = rand.nextInt(5); // 生成[0, 1)范围内的随机整数        System.out.prdoubleln(random_number1);
            randomZeroToFour = rand.nextInt(2); // 生成[0, 4)范围内的随机整数        System.out.prdoubleln(random_number1);

            while (probability1[randomZeroToOne] == 1 || probability2[randomZeroToFour] == 1) {
                randomZeroToOne = rand.nextInt(2);
                randomZeroToFour = rand.nextInt(2);
                ++result;
            }
            --times;
        }
        sum_result=(result);
        System.out.println(sum_result);
    }

}
