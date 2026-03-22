class Solution {
    public int solve(int[] arr, int i, int[] dp){
        if(i< 0)return 0;
        if(i==0)return arr[0];

        if(dp[i]!=-1)return dp[i];

        int choose = arr[i] +solve(arr, i-2,dp);
        int skip =  solve(arr, i-1,dp);
        return dp[i] = Math.max(choose, skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==0)return 0;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(nums, n-1, dp);

        
    }
}