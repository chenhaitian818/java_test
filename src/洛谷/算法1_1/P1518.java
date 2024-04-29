package 洛谷.算法1_1;

import java.util.Scanner;

public class P1518 {
    public static void main(String[] args) {
//        这题还需要判断是否陷入死循环用专属值来判断专属值包括 c的方向 位置 f 的方向 位置
//        这是一个大佬的想法
//        我们可以通过生成专属值的方法来判断：
//        农夫的x坐标+他的y坐标* 10+奶牛的x坐标* 100+奶牛的y坐标* 1000+农夫的方向* 10000+奶牛的方向* 40000（农夫方向最多为4）
//        输入部分
        int C_x=1,C_y=1,F_x=1,F_y=1;
        Scanner sc=  new Scanner(System.in);
        char[][] chars = new char[12][12];
        for (int i = 1; i <= 10; i++) {
            String str = sc.next();
            for (int j = 1; j <= 10 ; j++) {
                chars[i][j]=str.charAt(j-1);
                if (chars[i][j]=='C'){
                    C_x=i;
                    C_y=j;
                }if (chars[i][j]=='F'){
                    F_x=i;
                    F_y=j;
                }
            }
        }
//        结果步数
        int result = 0 ;
//        牛方向控制器
        int C_direction=0;
//        John方向控制器
        int John_direction=0;
        while (result<=10000){
            if (C_x==F_x&&C_y==F_y) {
                System.out.println(result);
                break;
            }
            switch (C_direction%4){
                case 0:
                    if (chars[C_x-1][C_y]=='.'||chars[C_x-1][C_y]=='F'){
                        chars[C_x-1][C_y]='C';
                        chars[C_x][C_y]='.';
                        --C_x;
                    }else
                        ++C_direction;
                    break;
                case 1:
                    if (chars[C_x][C_y+1]=='.'||chars[C_x][C_y+1]=='F'){
                        chars[C_x][C_y+1]='C';
                        chars[C_x][C_y]='.';
                        ++C_y;
                    }else
                        ++C_direction;
                    break;
                case 2:
                    if (chars[C_x+1][C_y]=='.'||chars[C_x+1][C_y]=='F'){
                        chars[C_x+1][C_y]='C';
                        chars[C_x][C_y]='.';
                        ++C_x;
                    }else
                        ++C_direction;
                    break;
                case 3:
                    if (chars[C_x][C_y-1]=='.'||chars[C_x][C_y-1]=='F'){
                        chars[C_x][C_y-1]='C';
                        chars[C_x][C_y]='.';
                        --C_y;
                    }else
                        ++C_direction;
                    break;
            }
            switch (John_direction%4){
                case 0:
                    if (chars[F_x-1][F_y]=='.'||chars[F_x-1][F_y]=='C'){
                        chars[F_x-1][F_y]='F';
                        chars[F_x][F_y]='.';
                        --F_x;
                    }else
                        ++John_direction;
                    break;
                case 1:
                    if (chars[F_x][F_y+1]=='.'||chars[F_x][F_y+1]=='C'){
                        chars[F_x][F_y+1]='F';
                        chars[F_x][F_y]='.';
                        ++F_y;
                    }else
                        ++John_direction;
                    break;
                case 2:
                    if (chars[F_x+1][F_y]=='.'||chars[F_x+1][F_y]=='C'){
                        chars[F_x+1][F_y]='F';
                        chars[F_x][F_y]='.';
                        ++F_x;
                    }else
                        ++John_direction;
                    break;
                case 3:
                    if (chars[F_x][F_y-1]=='.'||chars[F_x][F_y-1]=='C'){
                        chars[F_x][F_y-1]='F';
                        chars[F_x][F_y]='.';
                        --F_y;
                    }else
                        ++John_direction;
                    break;
            }
            ++result;
        }
        if (result>10000) System.out.println(0);
    }
}
