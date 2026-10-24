class Solution {

    public int dfs(int sr, int sc, int[][] grid) {
        int count = 1;

        grid[sr][sc] = 0;
        int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int i = 0; i < direction.length; i++) {
            int newrow = sr + direction[i][0];
            int newcol = sc + direction[i][1];

            if (newrow >= 0 && newrow < grid.length && newcol >= 0 && newcol < grid[0].length
                    && grid[newrow][newcol] == 1) {

                count += dfs(newrow, newcol, grid);
            }
        }
        return count;

    }

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max =0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(i, j, grid);
                        max = Math.max(max, area);
                }
            }
        }
        return max;
    }
}