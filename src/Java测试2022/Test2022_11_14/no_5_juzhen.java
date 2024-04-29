package Test2022_11_14;

public class no_5_juzhen {
    //2、首先需要构建该矩阵，实现其右边元素比左边大1，下边比上大2，
//3、暴力解法，即构建一个Sum方法对于其子矩阵求和，并通过子矩阵最后一个元素的下标求该子矩阵总共的元素数量！
//4、通过遍历全部元素可得子矩阵中和未2022的子矩阵有多个符合条件，且须为最小的元素数量
//5、结果为 12
//    即Result=(2+1)*(3+1)=12
    public  static void main(String agrs[]) {
        int Sum=0;
        int Result=0;
        int Array[][] = new int[100][100];
        for (int L = 0; L <99; L++) {
            for (int C = 0; C <99; C++) {
                if (L == 0 && C == 0)
                    Array[L][C] = 1;
                if (C == 0 && L != 0)
                    Array[L][C] = Array[L - 1][C] + 1;
                Array[L][C + 1] = Array[L][C] + 2;
            }
        }

        for (int x = 0; x <100; x++) {
            for (int y = 0; y <100; y++) {
                for(int n=1;n<100-x;n++){
                    for (int k=1;k<100-y;k++){
                        Sum=FindSum(Array,x,y,n,k);
                        if(Sum==2022) {
                            Result=n*k;
                            //System.out.println(n*k);
                            break;
                        }
                        else if(Sum>2022)
                            break;
                    }
                }
            }
        }
        System.out.println(Result);
    }
    public static int FindSum(int Num[][],int x,int y,int x1,int y2){
        int Sum=0;
        for(int L=x;L<x+x1;L++) {
            for (int C=y; C< y + y2; C++)
                Sum += Num[L][C];
        }
        return Sum;
    }

}
