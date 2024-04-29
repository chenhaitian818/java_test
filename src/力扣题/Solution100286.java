package 力扣题;

public class Solution100286 {
    static int[][] adress= new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
    public static boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (isCheck(i,j,grid)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCheck(int x,int y ,char[][] grid){
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j <= 3; j++) {
                int a = x+adress[i][0];
                int b = y+adress[i][1];
                int aa = x+adress[j][0];
                int bb= y+adress[j][1];
                if (aa>=0&&a>=0&&aa<grid.length&&a<grid.length&&bb>=0&&b>=0&&bb<grid.length&&b<grid.length&&grid[aa][bb]==grid[a][b]&&grid[x][y]==grid[a][b]){
                    return true;
                }
            }
        }
        return false;
    }
}
