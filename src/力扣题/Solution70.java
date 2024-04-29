package 力扣题;

class Solution70 {
    public int climbStairs(int n) {
        double definition = 2;//根据题目除1以外的另一个数
        double base = n;//剩余1的数量
        double boss = 0;//definition的数量
        double result = 1;//结果（因为题目中说明n>=1）所以初始化变量为1
        while (base >= definition) {
            base -= definition;//部分的1转化为了一个definition
            ++boss;
            result+=C_Combination(boss,boss+base);
            //调用写好的计算组合方法返回一个C (boss+base(下) boss(上))的得数
        }
        return (int)result;//返回结果
    }
    //写一个计算C（组合）的方法
    public double C_Combination(double c_up,double c_down){
        double c_up_result = 1;
        double c_down_result = 1;
        for (double i = c_up; i > 0 ; --i) {
            c_down_result*=c_down;
            c_up_result*=c_up;
            --c_down;
            --c_up;
        }
        return c_down_result/c_up_result;
    }
}