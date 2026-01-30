class Solution {

    public boolean subsetsum(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        //best condition

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int j = 1; j <= sum; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];

    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            totalsum += nums[i];
        }

        if (totalsum % 2 != 0)
            return false;

        return subsetsum(nums, totalsum / 2);

    }
}