class Solution {
    public int solve(int[][] grid, int i, int j, int[][] dp) {

        // base  case 
        if (i < 0 || j < 0)
            return 0;
        if (grid[i][j] == 1) {
            return 0;
        }

        if (i == 0 && j == 0)
            return 1;

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int left = 0;
        int up = 0;
        if (j - 1 >= 0 && grid[i][j - 1] != 1) {
            left = solve(grid, i, j - 1, dp);

        }

        if (i - 1 >= 0 && grid[i - 1][j] != 1) {
            up = solve(grid, i - 1, j, dp);
        }

        return dp[i][j] = left + up;

    }

    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(grid, m - 1, n - 1, dp);

    }
}