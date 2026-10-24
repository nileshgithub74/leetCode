class Solution {

    public void dfs(int sr, int sc, char[][] grid) {
        grid[sr][sc] = 'S';

        int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int i = 0; i < direction.length; i++) {
            int newrow = sr + direction[i][0];
            int newcol = sc + direction[i][1];

            if (newrow >= 0 && newrow < grid.length && newcol >= 0 && newcol < grid[0].length
                    && grid[newrow][newcol] == 'O') {
                dfs(newrow, newcol, grid);
            }

        }
    }

    public void solve(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        //first row 
        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 'O') {
                dfs(0, j, grid);
            }
        }

        // last row
        for (int j = 0; j < n; j++) {
            if (grid[m - 1][j] == 'O') {
                dfs(m - 1, j, grid);
            }
        }

        // first col
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 'O') {
                dfs(i, 0, grid);
            }
        }

        //last row
        for (int i = 0; i < m; i++) {
            if (grid[i][n - 1] == 'O') {
                dfs(i, n - 1, grid);
            }
        }

        

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 'O') {
                    grid[i][j] = 'X';
                }
                else if(grid[i][j] == 'S'){
                    grid[i][j] = 'O';
                }
            }
        }
        

    }
}