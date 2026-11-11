class Solution {
    static int[][] dp;

    public int solve(List<List<Integer>> triangle, int i, int j) {
        // base case 
        int n = triangle.size();
        if (i == n - 1) {
            return triangle.get(i).get(j);
        }

        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }
        int sum = triangle.get(i).get(j);

        int right = solve(triangle, i + 1, j + 1);
        int down = solve(triangle, i + 1, j);

        int min = Integer.MAX_VALUE;
        min = Math.min(min, Math.min(right, down));
        return dp[i][j] = min + sum;

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        dp = new int[200 + 1][200 + 1];

        for (int i = 0; i < 201; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        return solve(triangle, 0, 0);

    }
}