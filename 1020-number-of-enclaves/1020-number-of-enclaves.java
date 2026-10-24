class Solution {

    public void dfs(int sr, int sc, int[][] grid) {
        grid[sr][sc] = 0;

        int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int i = 0; i < direction.length; i++) {
            int newrow = sr + direction[i][0];
            int newcol = sc + direction[i][1];

            if (newrow >= 0 && newrow < grid.length && newcol >= 0 && newcol < grid[0].length
                    && grid[newrow][newcol] == 1) {
                dfs(newrow, newcol, grid);
            }

        }
    }

    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //first row 
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) {
                dfs(0, j, grid);
            }
        }

        // last row
        for (int j = 0; j < n; j++) {
            if (grid[m - 1][j] == 1) {
                dfs(m - 1, j, grid);
            }
        }

        // first col
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                dfs(i, 0, grid);
            }
        }

        //last row
        for (int i = 0; i < m; i++) {
            if (grid[i][n - 1] == 1) {
                dfs(i, n - 1, grid);
            }
        }

        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    result++;
                }
            }
        }
        return result;

    }
}