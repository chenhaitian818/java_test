package 蓝桥杯练习.第11届Javab组决赛;

public class E {
    static int result = 0;

    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int[][] boo = new int[4][4];
                boo[i][j]=1;
                dp(boo,i,j,1);
            }
        }
        System.out.println(result);
    }

    public static void dp(int [][] boo,int i , int j,int head){
//        向上
        if (i>0&&boo[i-1][j]!=1){
            boo[i-1][j]=1;
            dp(boo,i-1,j,head+1);
            boo[i-1][j]=0;
        }
//        向左
        if (j>0&&boo[i][j-1]!=1){
            boo[i][j-1]=1;
            dp(boo,i,j-1,head+1);
            boo[i][j-1]=0;
        }
//        向下
        if (i<3&&boo[i+1][j]!=1){
            boo[i+1][j]=1;
            dp(boo,i+1,j,head+1);
            boo[i+1][j]=0;
        }
//        向右
        if (j<3&&boo[i][j+1]!=1){
            boo[i][j+1]=1;
            dp(boo,i,j+1,head+1);
            boo[i][j+1]=0;
        }
        if (head==4) ++result;
    }
}
