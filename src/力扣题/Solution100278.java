package 力扣题;

public class Solution100278 {
    public static void main(String[] args) {
        int[][] gird = new int[][]{{1,0,0,0},{0,1,0,1},{1,0,0,0}};
        System.out.println(numberOfRightTriangles(gird));
    }
    public static long numberOfRightTriangles(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        long answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1&&row[i]>=2&&col[j]>=2){
                    answer += (long) (row[i] - 1) *(col[j]-1);
                }
            }
        }
        return answer;
    }

}
