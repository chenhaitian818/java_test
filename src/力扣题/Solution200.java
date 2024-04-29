package 力扣题;

import java.util.HashSet;
import java.util.Set;

public class Solution200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int rn = grid.length;
        int cn = grid[0].length;
        int ans = 0;
        for (int r = 0; r < rn; r++) {
            for (int c = 0; c < cn; c++) {
                if (grid[r][c] == '1') {
                    ++ans;
                    dfs(grid, r, c);
                }
            }
        }
        return ans;
    }

    void dfs(char[][] grid, int r, int c) {
        int rn = grid.length;
        int cn = grid[0].length;
        if (r < 0 || c < 0 || r >= rn || c >= cn || grid[r][c] == '0') return;
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }
}
