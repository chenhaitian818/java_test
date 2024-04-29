package 力扣题;


import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;
        int left = 0, top = 0, right = matrix[0].length - 1, bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; ++column) {
                list.add(matrix[top][column]);
            }
            for (int row = top + 1; row <= bottom; ++row) {
                list.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; --column) {
                    list.add(matrix[bottom][column]);
                }
                for (int row = bottom; row > top; --row) {
                    list.add(matrix[row][left]);
                }
            }
            --bottom;
            --right;
            ++left;
            ++top;
        }
        return list;
    }
}
