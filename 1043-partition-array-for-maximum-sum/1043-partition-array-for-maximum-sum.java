class Solution {
    public int solve(int[] arr, int i, int k, int[] dp) {
        int n = arr.length;
        if (i == n)
            return 0;
        int max = 0;
        int maxsum = 0;

        if (dp[i] != -1) {
            return dp[i];
        }
      
        for (int j = i; j < n && j - i + 1 <= k; j++) {
            max = Math.max(arr[j], max);
            int len = j - i + 1;
            int currsum = max * len;
            int remaining = solve(arr, j + 1, k, dp);
            int total = currsum + remaining;
            maxsum = Math.max(maxsum, total);
        }
        dp[i] = maxsum;
        return maxsum;
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        return solve(arr, 0, k, dp);

    }
}