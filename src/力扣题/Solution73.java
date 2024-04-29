package 力扣题;

public class Solution73 {
    public void setZeroes(int[][] matrix) {
        int x = matrix[0].length, y = matrix.length;
        boolean[] y_arr = new boolean[y];
        boolean[] x_arr = new boolean[x];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (matrix[i][j] == 0) {
                    x_arr[j] = true;
                    y_arr[i] = true;
                }
            }
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (x_arr[j] || y_arr[i]) {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
