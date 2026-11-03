class Solution {
    public int subsetcount(int[] arr, int sum, int n) {

        if(n==0){
            return sum==0 ? 1: 0;
        }

      
        int ans = 0;
        if (arr[n - 1] <= sum) {
            int take = subsetcount(arr, sum - arr[n - 1], n - 1);
            int notTake = subsetcount(arr, sum, n - 1);
            ans = take + notTake;
        } else {
            return subsetcount(arr, sum, n - 1);
        }

        return ans;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalsum = 0;
        for (int x : nums) {
            totalsum += x;
        }

        if ((totalsum + target) % 2 != 0)
            return 0;
        int sum = (totalsum + target) / 2;
        ;
        return subsetcount(nums, sum, n);

    }
}