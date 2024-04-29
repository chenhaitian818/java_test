package 力扣题;

public class Solution48 {
    public void rotate(int[][] matrix) {
        int x ;
        for (int i = 0; i <= (matrix.length-2)/2; i++) {
            for (int j = 0; j <= (matrix.length-1)/2; j++) {
                x=matrix[i][j];
                matrix[i][j]=matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i]=matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j]=matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i]=x;
            }
        }
    }
}
