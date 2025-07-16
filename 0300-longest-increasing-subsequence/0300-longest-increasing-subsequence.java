class Solution {
    public int lengthOfLIS(int[] nums) {

          if (nums == null || nums.length == 0) return 0;


        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);


        int  n = nums.length;
        int maxlen = 1;

        for(int i=1; i <n ; i++ ){
            for(int j = i-1;  j >=0; j--){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+ 1);

                }
            }
            maxlen = Math.max(maxlen, dp[i]);
        }

        return maxlen;
        

         






        
    }
}