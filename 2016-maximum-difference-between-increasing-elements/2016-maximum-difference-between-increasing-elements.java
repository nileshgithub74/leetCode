class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int maxDiff =-1;

        for(int i =0;i <n; i++){
            for(int j= i; j <n; j++){
                if(nums[i] < nums[j]){
                    maxDiff = Math.max(maxDiff, nums[j]- nums[i]);
                }
            }

        }
        return maxDiff;
        
    }
}