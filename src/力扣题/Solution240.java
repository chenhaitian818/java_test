package 力扣题;

import javax.naming.directory.SearchControls;

public class Solution240 {
    public static void main(String[] args) {
        int[][] matrix=new int[][]{{1,1}};
        System.out.println(searchMatrix(matrix, 2));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int n =matrix.length,m=matrix[0].length;
        int y=m-1,x=0;
        while (y>=0&&x<=n-1){
            if (matrix[x][y]==target)return true;
            if (matrix[x][y]>target)
                --y;
            else ++x;
        }
        return false;
    }
}
